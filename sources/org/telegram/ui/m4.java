package org.telegram.ui;

import java.util.ArrayList;
public final class m4 implements Runnable {
    public final p4 f35474a;

    public m4(p4 p4Var) {
        this.f35474a = p4Var;
    }

    @Override
    public final void run() {
        ?? m2Var = new org.telegram.ui.ActionBar.m2(null);
        m2Var.N = new a0.i();
        m2Var.O = new ArrayList();
        m2Var.f31903x = 1;
        m2Var.G = false;
        p4 p4Var = this.f35474a;
        m2Var.R = p4Var.U();
        m2Var.f31899n = new z0(this, 2);
        p4Var.presentFragment((org.telegram.ui.ActionBar.m2) m2Var);
    }
}
