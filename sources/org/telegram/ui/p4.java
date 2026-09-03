package org.telegram.ui;

import java.util.ArrayList;
public final class p4 implements Runnable {
    public final s4 f39880a;

    public p4(s4 s4Var) {
        this.f39880a = s4Var;
    }

    @Override
    public final void run() {
        ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
        p2Var.K = new a0.h();
        p2Var.L = new ArrayList();
        p2Var.f34939x = 1;
        p2Var.D = false;
        s4 s4Var = this.f39880a;
        p2Var.O = s4Var.U();
        p2Var.f34935n = new a1(this, 2);
        s4Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
    }
}
