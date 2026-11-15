package org.telegram.ui.Components;
public final class db0 implements Runnable {
    public boolean f33896a;
    public final ib0 f33897b;

    public db0(ib0 ib0Var) {
        this.f33897b = ib0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f33896a;
        ib0 ib0Var = this.f33897b;
        ib0Var.a(z10);
        ib0Var.postDelayed(this, ib0Var.N);
    }
}
