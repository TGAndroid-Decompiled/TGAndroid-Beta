package org.telegram.ui.Wallet;
public final class r6 implements Runnable {
    public final int f44993a;
    public final t6 f44994b;

    public r6(t6 t6Var, int i7) {
        this.f44993a = i7;
        this.f44994b = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f44993a) {
            case 0:
                this.f44994b.performClick();
                return;
            default:
                t6 t6Var = this.f44994b;
                t6Var.h.invalidate();
                t6Var.f45183n.invalidate();
                t6Var.f45173e.invalidate();
                return;
        }
    }
}
