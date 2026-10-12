package org.telegram.ui.Components;
public final class td0 implements Runnable {
    public boolean f30870a;
    public final yd0 f30871b;

    public td0(yd0 yd0Var) {
        this.f30871b = yd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30870a;
        yd0 yd0Var = this.f30871b;
        yd0Var.a(z10);
        yd0Var.postDelayed(this, yd0Var.L);
    }
}
