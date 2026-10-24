package org.telegram.ui.Components;
public final class jd0 implements Runnable {
    public boolean f27683a;
    public final od0 f27684b;

    public jd0(od0 od0Var) {
        this.f27684b = od0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f27683a;
        od0 od0Var = this.f27684b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.M);
    }
}
