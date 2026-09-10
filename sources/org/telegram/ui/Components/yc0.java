package org.telegram.ui.Components;
public final class yc0 implements Runnable {
    public boolean f29303a;
    public final dd0 f29304b;

    public yc0(dd0 dd0Var) {
        this.f29304b = dd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f29303a;
        dd0 dd0Var = this.f29304b;
        dd0Var.a(z10);
        dd0Var.postDelayed(this, dd0Var.L);
    }
}
