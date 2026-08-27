package org.telegram.ui;

import java.util.ArrayList;

public final class n4 implements Runnable {

    public final q4 f40658a;

    public n4(q4 q4Var) {
        this.f40658a = q4Var;
    }

    @Override
    public final void run() {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(null);
        usersSelectActivity.J = new a0.h();
        usersSelectActivity.K = new ArrayList();
        usersSelectActivity.f36297x = 1;
        usersSelectActivity.C = false;
        q4 q4Var = this.f40658a;
        usersSelectActivity.N = q4Var.U();
        usersSelectActivity.f36293n = new c1(this, 2);
        q4Var.presentFragment(usersSelectActivity);
    }
}
