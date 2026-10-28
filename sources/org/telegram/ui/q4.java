package org.telegram.ui;

import java.util.ArrayList;
public final class q4 implements Runnable {
    public final t4 f42611a;

    public q4(t4 t4Var) {
        this.f42611a = t4Var;
    }

    @Override
    public final void run() {
        ?? r2Var = new org.telegram.ui.ActionBar.r2(null);
        r2Var.N = new a0.h();
        r2Var.O = new ArrayList();
        r2Var.f36354x = 1;
        r2Var.G = false;
        t4 t4Var = this.f42611a;
        r2Var.R = t4Var.V();
        r2Var.f36350n = new y0(this, 2);
        t4Var.presentFragment((org.telegram.ui.ActionBar.r2) r2Var);
    }
}
