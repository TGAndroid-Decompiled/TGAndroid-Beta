package org.telegram.ui;

import java.util.ArrayList;
public final class n4 implements Runnable {
    public final q4 f40706a;

    public n4(q4 q4Var) {
        this.f40706a = q4Var;
    }

    @Override
    public final void run() {
        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
        o2Var.J = new a0.h();
        o2Var.K = new ArrayList();
        o2Var.f36359x = 1;
        o2Var.C = false;
        q4 q4Var = this.f40706a;
        o2Var.N = q4Var.U();
        o2Var.f36355n = new c1(this, 2);
        q4Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
    }
}
