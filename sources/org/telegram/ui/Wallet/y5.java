package org.telegram.ui.Wallet;
public final class y5 implements Runnable {
    public final int f43385a;
    public final a6 f43386b;

    public y5(a6 a6Var, int i7) {
        this.f43385a = i7;
        this.f43386b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f43385a) {
            case 0:
                this.f43386b.performClick();
                return;
            default:
                a6 a6Var = this.f43386b;
                a6Var.h.invalidate();
                a6Var.f42128n.invalidate();
                a6Var.f42118e.invalidate();
                return;
        }
    }
}
