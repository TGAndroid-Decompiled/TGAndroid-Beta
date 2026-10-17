package org.telegram.ui.Components;
public final class jd0 implements Runnable {
    public boolean f27508a;
    public final od0 f27509b;

    public jd0(od0 od0Var) {
        this.f27509b = od0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f27508a;
        od0 od0Var = this.f27509b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.L);
    }
}
