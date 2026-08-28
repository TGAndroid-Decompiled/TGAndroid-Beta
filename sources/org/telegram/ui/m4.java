package org.telegram.ui;

import java.util.ArrayList;
public final class m4 implements Runnable {
    public final p4 f40316a;

    public m4(p4 p4Var) {
        this.f40316a = p4Var;
    }

    @Override
    public final void run() {
        ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
        o2Var.J = new a0.h();
        o2Var.K = new ArrayList();
        o2Var.f36294x = 1;
        o2Var.C = false;
        p4 p4Var = this.f40316a;
        o2Var.N = p4Var.T();
        o2Var.f36290n = new b1(this, 2);
        p4Var.presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
    }
}
