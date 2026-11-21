package org.telegram.ui.Wallet;
public final class q6 implements Runnable {
    public final int f44861a;
    public final s6 f44862b;

    public q6(s6 s6Var, int i7) {
        this.f44861a = i7;
        this.f44862b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f44861a) {
            case 0:
                this.f44862b.performClick();
                return;
            default:
                s6 s6Var = this.f44862b;
                s6Var.h.invalidate();
                s6Var.f45051n.invalidate();
                s6Var.f45041e.invalidate();
                return;
        }
    }
}
