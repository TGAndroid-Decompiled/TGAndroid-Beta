package org.telegram.ui.Components;
public final class ob0 implements Runnable {
    public boolean f38159a;
    public final tb0 f38160b;

    public ob0(tb0 tb0Var) {
        this.f38160b = tb0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f38159a;
        tb0 tb0Var = this.f38160b;
        tb0Var.a(z10);
        tb0Var.postDelayed(this, tb0Var.N);
    }
}
