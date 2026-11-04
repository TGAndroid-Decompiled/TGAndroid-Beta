package org.telegram.ui.Components;
public final class xa0 implements Runnable {
    public boolean f40300a;
    public final cb0 f40301b;

    public xa0(cb0 cb0Var) {
        this.f40301b = cb0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f40300a;
        cb0 cb0Var = this.f40301b;
        cb0Var.a(z10);
        cb0Var.postDelayed(this, cb0Var.N);
    }
}
