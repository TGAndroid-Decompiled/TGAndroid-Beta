package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f35072a;
    public final s5 f35073b;

    public q5(s5 s5Var, int i10) {
        this.f35072a = i10;
        this.f35073b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f35072a) {
            case 0:
                this.f35073b.performClick();
                return;
            default:
                s5 s5Var = this.f35073b;
                s5Var.h.invalidate();
                s5Var.f35147n.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
