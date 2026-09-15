package org.telegram.ui.Components;
public final class pc0 implements Runnable {
    public boolean f27011a;
    public final uc0 f27012b;

    public pc0(uc0 uc0Var) {
        this.f27012b = uc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f27011a;
        uc0 uc0Var = this.f27012b;
        uc0Var.a(z10);
        uc0Var.postDelayed(this, uc0Var.L);
    }
}
