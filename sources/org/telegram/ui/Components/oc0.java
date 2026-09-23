package org.telegram.ui.Components;
public final class oc0 implements Runnable {
    public boolean f26719a;
    public final tc0 f26720b;

    public oc0(tc0 tc0Var) {
        this.f26720b = tc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f26719a;
        tc0 tc0Var = this.f26720b;
        tc0Var.a(z10);
        tc0Var.postDelayed(this, tc0Var.L);
    }
}
