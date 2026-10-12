package org.telegram.ui;

import java.util.ArrayList;
public final class p4 implements Runnable {
    public final s4 f40842a;

    public p4(s4 s4Var) {
        this.f40842a = s4Var;
    }

    @Override
    public final void run() {
        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
        m2Var.N = new a0.i();
        m2Var.O = new ArrayList();
        m2Var.f34438x = 1;
        m2Var.G = false;
        s4 s4Var = this.f40842a;
        m2Var.R = s4Var.U();
        m2Var.f34434n = new z0(this, 2);
        s4Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
    }
}
