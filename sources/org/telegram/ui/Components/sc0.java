package org.telegram.ui.Components;
public final class sc0 implements Runnable {
    public boolean f28721a;
    public final xc0 f28722b;

    public sc0(xc0 xc0Var) {
        this.f28722b = xc0Var;
    }

    @Override
    public final void run() {
        boolean z4 = this.f28721a;
        xc0 xc0Var = this.f28722b;
        xc0Var.a(z4);
        xc0Var.postDelayed(this, xc0Var.I);
    }
}
