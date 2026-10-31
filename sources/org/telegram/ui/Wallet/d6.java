package org.telegram.ui.Wallet;
public final class d6 implements Runnable {
    public final int f34423a;
    public final g6 f34424b;

    public d6(g6 g6Var, int i10) {
        this.f34423a = i10;
        this.f34424b = g6Var;
    }

    @Override
    public final void run() {
        switch (this.f34423a) {
            case 0:
                this.f34424b.performClick();
                return;
            default:
                g6 g6Var = this.f34424b;
                g6Var.h.invalidate();
                g6Var.f34568n.invalidate();
                g6Var.e.invalidate();
                return;
        }
    }
}
