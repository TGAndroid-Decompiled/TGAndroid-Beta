package org.telegram.ui.Components;

public final class ac0 implements Runnable {

    public boolean f26726a;

    public final fc0 f26727b;

    public ac0(fc0 fc0Var) {
        this.f26727b = fc0Var;
    }

    @Override
    public final void run() {
        boolean z10 = this.f26726a;
        fc0 fc0Var = this.f26727b;
        fc0Var.a(z10);
        fc0Var.postDelayed(this, fc0Var.H);
    }
}
