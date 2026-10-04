package org.telegram.ui.Components;
public final class bd0 implements Runnable {
    public boolean f24924a;
    public final gd0 f24925b;

    public bd0(gd0 gd0Var) {
        this.f24925b = gd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f24924a;
        gd0 gd0Var = this.f24925b;
        gd0Var.a(z10);
        gd0Var.postDelayed(this, gd0Var.L);
    }
}
