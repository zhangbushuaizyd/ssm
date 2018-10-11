package com.shsxt.service;

import com.shsxt.base.BaseService;
import com.shsxt.dao.UserMapper;
import com.shsxt.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserService extends BaseService<User> {
    @Resource
    private UserMapper userMapper;
}
