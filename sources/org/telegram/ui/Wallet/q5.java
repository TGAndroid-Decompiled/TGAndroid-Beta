package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f34774a;
    public final s5 f34775b;

    public q5(s5 s5Var, int i10) {
        this.f34774a = i10;
        this.f34775b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f34774a) {
            case 0:
                this.f34775b.performClick();
                return;
            default:
                s5 s5Var = this.f34775b;
                s5Var.h.invalidate();
                s5Var.f34856n.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
