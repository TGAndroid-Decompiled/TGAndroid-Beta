package org.telegram.ui.Wallet;
public final class d6 implements Runnable {
    public final int f34428a;
    public final g6 f34429b;

    public d6(g6 g6Var, int i10) {
        this.f34428a = i10;
        this.f34429b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f34428a) {
            case 0:
                this.f34429b.performClick();
                return;
            default:
                g6 g6Var = this.f34429b;
                g6Var.h.invalidate();
                g6Var.f34574n.invalidate();
                g6Var.e.invalidate();
                return;
        }
    }
}
