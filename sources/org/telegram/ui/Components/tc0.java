package org.telegram.ui.Components;
public final class tc0 implements Runnable {
    public boolean f31336a;
    public final yc0 f31337b;

    public tc0(yc0 yc0Var) {
        this.f31337b = yc0Var;
    }

    @Override
    public final void run() {
        boolean z4 = this.f31336a;
        yc0 yc0Var = this.f31337b;
        yc0Var.a(z4);
        yc0Var.postDelayed(this, yc0Var.I);
    }
}
