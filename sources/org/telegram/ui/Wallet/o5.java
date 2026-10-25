package org.telegram.ui.Wallet;
public final class o5 implements Runnable {
    public final int f37058a;
    public final r5 f37059b;

    public o5(r5 r5Var, int i10) {
        this.f37058a = i10;
        this.f37059b = r5Var;
    }

    @Override
    public final void run() {
        switch (this.f37058a) {
            case 0:
                this.f37059b.performClick();
                return;
            default:
                r5 r5Var = this.f37059b;
                r5Var.h.invalidate();
                r5Var.f37179n.invalidate();
                r5Var.e.invalidate();
                return;
        }
    }
}
