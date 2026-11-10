package org.telegram.ui.Wallet;
public final class b6 implements Runnable {
    public final int f42179a;
    public final d6 f42180b;

    public b6(d6 d6Var, int i7) {
        this.f42179a = i7;
        this.f42180b = d6Var;
    }

    @Override
    public final void run() {
        switch (this.f42179a) {
            case 0:
                this.f42180b.performClick();
                return;
            default:
                d6 d6Var = this.f42180b;
                d6Var.h.invalidate();
                d6Var.f42367n.invalidate();
                d6Var.f42357e.invalidate();
                return;
        }
    }
}
