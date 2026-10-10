package org.telegram.ui.Components;
public final class qd0 implements Runnable {
    public boolean f30193a;
    public final vd0 f30194b;

    public qd0(vd0 vd0Var) {
        this.f30194b = vd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30193a;
        vd0 vd0Var = this.f30194b;
        vd0Var.a(z10);
        vd0Var.postDelayed(this, vd0Var.L);
    }
}
