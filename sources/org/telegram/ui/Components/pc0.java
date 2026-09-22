package org.telegram.ui.Components;
public final class pc0 implements Runnable {
    public boolean f27008a;
    public final uc0 f27009b;

    public pc0(uc0 uc0Var) {
        this.f27009b = uc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f27008a;
        uc0 uc0Var = this.f27009b;
        uc0Var.a(z10);
        uc0Var.postDelayed(this, uc0Var.L);
    }
}
