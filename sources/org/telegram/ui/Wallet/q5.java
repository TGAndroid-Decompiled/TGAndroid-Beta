package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f34778a;
    public final s5 f34779b;

    public q5(s5 s5Var, int i10) {
        this.f34778a = i10;
        this.f34779b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f34778a) {
            case 0:
                this.f34779b.performClick();
                return;
            default:
                s5 s5Var = this.f34779b;
                s5Var.h.invalidate();
                s5Var.f34860n.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
