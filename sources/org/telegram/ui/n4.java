package org.telegram.ui;

import java.util.ArrayList;
public final class n4 implements Runnable {
    public final q4 f35113a;

    public n4(q4 q4Var) {
        this.f35113a = q4Var;
    }

    @Override
    public final void run() {
        ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
        p2Var.N = new a0.i();
        p2Var.O = new ArrayList();
        p2Var.f30728x = 1;
        p2Var.G = false;
        q4 q4Var = this.f35113a;
        p2Var.R = q4Var.U();
        p2Var.f30724n = new a1(this, 2);
        q4Var.presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
    }
}
