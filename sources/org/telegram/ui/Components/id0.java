package org.telegram.ui.Components;
public final class id0 implements Runnable {
    public boolean f29319a;
    public final nd0 f29320b;

    public id0(nd0 nd0Var) {
        this.f29320b = nd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f29319a;
        nd0 nd0Var = this.f29320b;
        nd0Var.a(z10);
        nd0Var.postDelayed(this, nd0Var.M);
    }
}
