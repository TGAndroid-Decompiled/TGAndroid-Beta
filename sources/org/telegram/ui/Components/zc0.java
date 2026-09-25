package org.telegram.ui.Components;
public final class zc0 implements Runnable {
    public boolean f30848a;
    public final ed0 f30849b;

    public zc0(ed0 ed0Var) {
        this.f30849b = ed0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30848a;
        ed0 ed0Var = this.f30849b;
        ed0Var.a(z10);
        ed0Var.postDelayed(this, ed0Var.L);
    }
}
