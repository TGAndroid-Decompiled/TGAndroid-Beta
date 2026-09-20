package org.telegram.ui.Components;
public final class xc0 implements Runnable {
    public boolean f30240a;
    public final cd0 f30241b;

    public xc0(cd0 cd0Var) {
        this.f30241b = cd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30240a;
        cd0 cd0Var = this.f30241b;
        cd0Var.a(z10);
        cd0Var.postDelayed(this, cd0Var.L);
    }
}
