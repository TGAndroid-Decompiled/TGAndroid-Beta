package org.telegram.ui.Components;
public final class qc0 implements Runnable {
    public boolean f29718a;
    public final vc0 f29719b;

    public qc0(vc0 vc0Var) {
        this.f29719b = vc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f29718a;
        vc0 vc0Var = this.f29719b;
        vc0Var.a(z10);
        vc0Var.postDelayed(this, vc0Var.L);
    }
}
