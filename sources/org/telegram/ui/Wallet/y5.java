package org.telegram.ui.Wallet;
public final class y5 implements Runnable {
    public final int f43472a;
    public final a6 f43473b;

    public y5(a6 a6Var, int i3) {
        this.f43472a = i3;
        this.f43473b = a6Var;
    }

    @Override
    public final void run() {
        switch (this.f43472a) {
            case 0:
                this.f43473b.performClick();
                return;
            default:
                a6 a6Var = this.f43473b;
                a6Var.h.invalidate();
                a6Var.f42153n.invalidate();
                a6Var.f42143e.invalidate();
                return;
        }
    }
}
