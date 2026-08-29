package org.telegram.ui.Components;
public final class lc0 implements Runnable {
    public boolean f30287a;
    public final qc0 f30288b;

    public lc0(qc0 qc0Var) {
        this.f30288b = qc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30287a;
        qc0 qc0Var = this.f30288b;
        qc0Var.a(z10);
        qc0Var.postDelayed(this, qc0Var.H);
    }
}
