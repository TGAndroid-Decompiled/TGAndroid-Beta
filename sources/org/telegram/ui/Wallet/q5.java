package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f34766a;
    public final s5 f34767b;

    public q5(s5 s5Var, int i10) {
        this.f34766a = i10;
        this.f34767b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f34766a) {
            case 0:
                this.f34767b.performClick();
                return;
            default:
                s5 s5Var = this.f34767b;
                s5Var.h.invalidate();
                s5Var.f34848n.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
