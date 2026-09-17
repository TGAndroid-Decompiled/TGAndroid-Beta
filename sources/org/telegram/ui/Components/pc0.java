package org.telegram.ui.Components;
public final class pc0 implements Runnable {
    public boolean f26998a;
    public final uc0 f26999b;

    public pc0(uc0 uc0Var) {
        this.f26999b = uc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f26998a;
        uc0 uc0Var = this.f26999b;
        uc0Var.a(z10);
        uc0Var.postDelayed(this, uc0Var.L);
    }
}
