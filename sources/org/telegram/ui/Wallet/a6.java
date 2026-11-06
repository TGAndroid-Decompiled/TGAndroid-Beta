package org.telegram.ui.Wallet;
public final class a6 implements Runnable {
    public final int f42101a;
    public final c6 f42102b;

    public a6(c6 c6Var, int i7) {
        this.f42101a = i7;
        this.f42102b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f42101a) {
            case 0:
                this.f42102b.performClick();
                return;
            default:
                c6 c6Var = this.f42102b;
                c6Var.h.invalidate();
                c6Var.f42243n.invalidate();
                c6Var.f42233e.invalidate();
                return;
        }
    }
}
