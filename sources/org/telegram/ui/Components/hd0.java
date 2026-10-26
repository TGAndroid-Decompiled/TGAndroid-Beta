package org.telegram.ui.Components;
public final class hd0 implements Runnable {
    public boolean f28949a;
    public final md0 f28950b;

    public hd0(md0 md0Var) {
        this.f28950b = md0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f28949a;
        md0 md0Var = this.f28950b;
        md0Var.a(z10);
        md0Var.postDelayed(this, md0Var.M);
    }
}
