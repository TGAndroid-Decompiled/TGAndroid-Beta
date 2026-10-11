package org.telegram.ui;

import java.util.ArrayList;
public final class l4 implements Runnable {
    public final o4 f39545a;

    public l4(o4 o4Var) {
        this.f39545a = o4Var;
    }

    @Override
    public final void run() {
        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
        m2Var.N = new a0.i();
        m2Var.O = new ArrayList();
        m2Var.f34663x = 1;
        m2Var.G = false;
        o4 o4Var = this.f39545a;
        m2Var.R = o4Var.U();
        m2Var.f34659n = new y0(this, 2);
        o4Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
    }
}
