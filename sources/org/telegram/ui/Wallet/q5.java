package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f34768a;
    public final s5 f34769b;

    public q5(s5 s5Var, int i10) {
        this.f34768a = i10;
        this.f34769b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f34768a) {
            case 0:
                this.f34769b.performClick();
                return;
            default:
                s5 s5Var = this.f34769b;
                s5Var.h.invalidate();
                s5Var.f34850n.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
