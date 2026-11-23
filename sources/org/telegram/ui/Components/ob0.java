package org.telegram.ui.Components;
public final class ob0 implements Runnable {
    public boolean f38160a;
    public final tb0 f38161b;

    public ob0(tb0 tb0Var) {
        this.f38161b = tb0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f38160a;
        tb0 tb0Var = this.f38161b;
        tb0Var.a(z10);
        tb0Var.postDelayed(this, tb0Var.N);
    }
}
