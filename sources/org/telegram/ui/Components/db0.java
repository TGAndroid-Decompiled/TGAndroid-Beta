package org.telegram.ui.Components;
public final class db0 implements Runnable {
    public boolean f33909a;
    public final ib0 f33910b;

    public db0(ib0 ib0Var) {
        this.f33910b = ib0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f33909a;
        ib0 ib0Var = this.f33910b;
        ib0Var.a(z10);
        ib0Var.postDelayed(this, ib0Var.N);
    }
}
