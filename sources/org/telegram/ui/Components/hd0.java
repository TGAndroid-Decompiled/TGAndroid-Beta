package org.telegram.ui.Components;
public final class hd0 implements Runnable {
    public boolean f28947a;
    public final md0 f28948b;

    public hd0(md0 md0Var) {
        this.f28948b = md0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f28947a;
        md0 md0Var = this.f28948b;
        md0Var.a(z10);
        md0Var.postDelayed(this, md0Var.M);
    }
}
