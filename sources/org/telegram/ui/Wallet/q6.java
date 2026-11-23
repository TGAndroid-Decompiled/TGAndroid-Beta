package org.telegram.ui.Wallet;
public final class q6 implements Runnable {
    public final int f44831a;
    public final s6 f44832b;

    public q6(s6 s6Var, int i7) {
        this.f44831a = i7;
        this.f44832b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f44831a) {
            case 0:
                this.f44832b.performClick();
                return;
            default:
                s6 s6Var = this.f44832b;
                s6Var.h.invalidate();
                s6Var.f45021n.invalidate();
                s6Var.f45011e.invalidate();
                return;
        }
    }
}
