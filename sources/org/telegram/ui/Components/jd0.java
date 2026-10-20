package org.telegram.ui.Components;
public final class jd0 implements Runnable {
    public boolean f27505a;
    public final od0 f27506b;

    public jd0(od0 od0Var) {
        this.f27506b = od0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f27505a;
        od0 od0Var = this.f27506b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.L);
    }
}
