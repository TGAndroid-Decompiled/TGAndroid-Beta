package org.telegram.ui;

import java.util.ArrayList;
public final class n4 implements Runnable {
    public final q4 f38812a;

    public n4(q4 q4Var) {
        this.f38812a = q4Var;
    }

    @Override
    public final void run() {
        ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
        n2Var.N = new a0.i();
        n2Var.O = new ArrayList();
        n2Var.f34592x = 1;
        n2Var.G = false;
        q4 q4Var = this.f38812a;
        n2Var.R = q4Var.S();
        n2Var.f34588n = new z0(this, 2);
        q4Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
    }
}
