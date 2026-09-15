package org.telegram.ui;

import java.util.ArrayList;
public final class m4 implements Runnable {
    public final p4 f35627a;

    public m4(p4 p4Var) {
        this.f35627a = p4Var;
    }

    @Override
    public final void run() {
        ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
        n2Var.N = new a0.i();
        n2Var.O = new ArrayList();
        n2Var.f31616x = 1;
        n2Var.G = false;
        p4 p4Var = this.f35627a;
        n2Var.R = p4Var.U();
        n2Var.f31612n = new y0(this, 2);
        p4Var.presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
    }
}
