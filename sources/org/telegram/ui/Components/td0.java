package org.telegram.ui.Components;
public final class td0 implements Runnable {
    public boolean f30867a;
    public final yd0 f30868b;

    public td0(yd0 yd0Var) {
        this.f30868b = yd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30867a;
        yd0 yd0Var = this.f30868b;
        yd0Var.a(z10);
        yd0Var.postDelayed(this, yd0Var.L);
    }
}
