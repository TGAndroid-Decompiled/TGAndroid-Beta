package org.telegram.ui.Components;
public final class ob0 implements Runnable {
    public boolean f38126a;
    public final tb0 f38127b;

    public ob0(tb0 tb0Var) {
        this.f38127b = tb0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f38126a;
        tb0 tb0Var = this.f38127b;
        tb0Var.a(z10);
        tb0Var.postDelayed(this, tb0Var.N);
    }
}
