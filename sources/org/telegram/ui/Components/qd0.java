package org.telegram.ui.Components;
public final class qd0 implements Runnable {
    public boolean f30142a;
    public final vd0 f30143b;

    public qd0(vd0 vd0Var) {
        this.f30143b = vd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30142a;
        vd0 vd0Var = this.f30143b;
        vd0Var.a(z10);
        vd0Var.postDelayed(this, vd0Var.L);
    }
}
