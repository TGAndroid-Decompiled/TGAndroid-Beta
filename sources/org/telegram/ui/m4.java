package org.telegram.ui;

import java.util.ArrayList;
public final class m4 implements Runnable {
    public final p4 f35682a;

    public m4(p4 p4Var) {
        this.f35682a = p4Var;
    }

    @Override
    public final void run() {
        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
        o2Var.N = new a0.i();
        o2Var.O = new ArrayList();
        o2Var.f31633x = 1;
        o2Var.G = false;
        p4 p4Var = this.f35682a;
        o2Var.R = p4Var.U();
        o2Var.f31629n = new y0(this, 2);
        p4Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
    }
}
