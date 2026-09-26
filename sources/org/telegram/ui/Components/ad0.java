package org.telegram.ui.Components;
public final class ad0 implements Runnable {
    public boolean f22618a;
    public final fd0 f22619b;

    public ad0(fd0 fd0Var) {
        this.f22619b = fd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f22618a;
        fd0 fd0Var = this.f22619b;
        fd0Var.a(z10);
        fd0Var.postDelayed(this, fd0Var.L);
    }
}
