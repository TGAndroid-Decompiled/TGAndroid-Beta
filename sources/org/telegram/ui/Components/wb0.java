package org.telegram.ui.Components;
public final class wb0 implements Runnable {
    public boolean f34184a;
    public final bc0 f34185b;

    public wb0(bc0 bc0Var) {
        this.f34185b = bc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f34184a;
        bc0 bc0Var = this.f34185b;
        bc0Var.a(z10);
        bc0Var.postDelayed(this, bc0Var.H);
    }
}
