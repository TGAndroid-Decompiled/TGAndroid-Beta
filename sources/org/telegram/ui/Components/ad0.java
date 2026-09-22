package org.telegram.ui.Components;
public final class ad0 implements Runnable {
    public boolean f22637a;
    public final fd0 f22638b;

    public ad0(fd0 fd0Var) {
        this.f22638b = fd0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f22637a;
        fd0 fd0Var = this.f22638b;
        fd0Var.a(z10);
        fd0Var.postDelayed(this, fd0Var.L);
    }
}
