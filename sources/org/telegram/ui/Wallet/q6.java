package org.telegram.ui.Wallet;
public final class q6 implements Runnable {
    public final int f44865a;
    public final s6 f44866b;

    public q6(s6 s6Var, int i7) {
        this.f44865a = i7;
        this.f44866b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f44865a) {
            case 0:
                this.f44866b.performClick();
                return;
            default:
                s6 s6Var = this.f44866b;
                s6Var.h.invalidate();
                s6Var.f45055n.invalidate();
                s6Var.f45045e.invalidate();
                return;
        }
    }
}
