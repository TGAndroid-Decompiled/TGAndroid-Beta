package org.telegram.ui.Wallet;
public final class z5 implements Runnable {
    public final int f43467a;
    public final b6 f43468b;

    public z5(b6 b6Var, int i7) {
        this.f43467a = i7;
        this.f43468b = b6Var;
    }

    @Override
    public final void run() {
        switch (this.f43467a) {
            case 0:
                this.f43468b.performClick();
                return;
            default:
                b6 b6Var = this.f43468b;
                b6Var.h.invalidate();
                b6Var.f42208n.invalidate();
                b6Var.f42198e.invalidate();
                return;
        }
    }
}
