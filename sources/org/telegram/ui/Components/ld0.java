package org.telegram.ui.Components;
public final class ld0 implements Runnable {
    public boolean f28349a;
    public final qd0 f28350b;

    public ld0(qd0 qd0Var) {
        this.f28350b = qd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f28349a;
        qd0 qd0Var = this.f28350b;
        qd0Var.a(z10);
        qd0Var.postDelayed(this, qd0Var.M);
    }
}
