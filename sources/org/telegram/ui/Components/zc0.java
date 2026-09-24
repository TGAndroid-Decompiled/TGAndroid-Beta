package org.telegram.ui.Components;
public final class zc0 implements Runnable {
    public boolean f30843a;
    public final ed0 f30844b;

    public zc0(ed0 ed0Var) {
        this.f30844b = ed0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30843a;
        ed0 ed0Var = this.f30844b;
        ed0Var.a(z10);
        ed0Var.postDelayed(this, ed0Var.L);
    }
}
