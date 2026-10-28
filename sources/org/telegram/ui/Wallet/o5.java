package org.telegram.ui.Wallet;
public final class o5 implements Runnable {
    public final int f37086a;
    public final r5 f37087b;

    public o5(r5 r5Var, int i10) {
        this.f37086a = i10;
        this.f37087b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f37086a) {
            case 0:
                this.f37087b.performClick();
                return;
            default:
                r5 r5Var = this.f37087b;
                r5Var.h.invalidate();
                r5Var.f37206n.invalidate();
                r5Var.e.invalidate();
                return;
        }
    }
}
