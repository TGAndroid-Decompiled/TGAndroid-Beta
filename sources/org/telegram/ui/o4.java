package org.telegram.ui;

import java.util.ArrayList;
public final class o4 implements Runnable {
    public final r4 f36134a;

    public o4(r4 r4Var) {
        this.f36134a = r4Var;
    }

    @Override
    public final void run() {
        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
        o2Var.N = new a0.i();
        o2Var.O = new ArrayList();
        o2Var.f31904x = 1;
        o2Var.G = false;
        r4 r4Var = this.f36134a;
        o2Var.R = r4Var.U();
        o2Var.f31900n = new a1(this, 2);
        r4Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
    }
}
