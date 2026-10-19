package org.telegram.ui.Components;
public final class jd0 implements Runnable {
    public boolean f27511a;
    public final od0 f27512b;

    public jd0(od0 od0Var) {
        this.f27512b = od0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f27511a;
        od0 od0Var = this.f27512b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.L);
    }
}
