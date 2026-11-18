package org.telegram.ui.Wallet;
public final class q6 implements Runnable {
    public final int f44821a;
    public final s6 f44822b;

    public q6(s6 s6Var, int i7) {
        this.f44821a = i7;
        this.f44822b = s6Var;
    }

    @Override
    public final void run() {
        switch (this.f44821a) {
            case 0:
                this.f44822b.performClick();
                return;
            default:
                s6 s6Var = this.f44822b;
                s6Var.h.invalidate();
                s6Var.f45011n.invalidate();
                s6Var.f45001e.invalidate();
                return;
        }
    }
}
