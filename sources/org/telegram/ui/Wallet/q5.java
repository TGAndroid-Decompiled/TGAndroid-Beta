package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f34775a;
    public final s5 f34776b;

    public q5(s5 s5Var, int i10) {
        this.f34775a = i10;
        this.f34776b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f34775a) {
            case 0:
                this.f34776b.performClick();
                return;
            default:
                s5 s5Var = this.f34776b;
                s5Var.h.invalidate();
                s5Var.f34857n.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
