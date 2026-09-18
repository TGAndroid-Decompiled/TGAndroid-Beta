package org.telegram.ui.Components;
public final class yc0 implements Runnable {
    public boolean f30551a;
    public final dd0 f30552b;

    public yc0(dd0 dd0Var) {
        this.f30552b = dd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f30551a;
        dd0 dd0Var = this.f30552b;
        dd0Var.a(z10);
        dd0Var.postDelayed(this, dd0Var.L);
    }
}
