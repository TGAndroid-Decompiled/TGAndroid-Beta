package org.telegram.ui.Wallet;
public final class o5 implements Runnable {
    public final int f37061a;
    public final r5 f37062b;

    public o5(r5 r5Var, int i10) {
        this.f37061a = i10;
        this.f37062b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f37061a) {
            case 0:
                this.f37062b.performClick();
                return;
            default:
                r5 r5Var = this.f37062b;
                r5Var.h.invalidate();
                r5Var.f37182n.invalidate();
                r5Var.e.invalidate();
                return;
        }
    }
}
