package org.telegram.ui.Components;
public final class lb0 implements Runnable {
    public boolean f37101a;
    public final qb0 f37102b;

    public lb0(qb0 qb0Var) {
        this.f37102b = qb0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f37101a;
        qb0 qb0Var = this.f37102b;
        qb0Var.a(z10);
        qb0Var.postDelayed(this, qb0Var.N);
    }
}
