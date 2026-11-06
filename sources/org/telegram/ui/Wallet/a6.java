package org.telegram.ui.Wallet;
public final class a6 implements Runnable {
    public final int f42076a;
    public final c6 f42077b;

    public a6(c6 c6Var, int i7) {
        this.f42076a = i7;
        this.f42077b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f42076a) {
            case 0:
                this.f42077b.performClick();
                return;
            default:
                c6 c6Var = this.f42077b;
                c6Var.h.invalidate();
                c6Var.f42218n.invalidate();
                c6Var.f42208e.invalidate();
                return;
        }
    }
}
