package org.telegram.ui.Components;
public final class qc0 implements Runnable {
    public boolean f29692a;
    public final vc0 f29693b;

    public qc0(vc0 vc0Var) {
        this.f29693b = vc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f29692a;
        vc0 vc0Var = this.f29693b;
        vc0Var.a(z10);
        vc0Var.postDelayed(this, vc0Var.L);
    }
}
