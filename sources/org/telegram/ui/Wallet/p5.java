package org.telegram.ui.Wallet;
public final class p5 implements Runnable {
    public final int f34706a;
    public final s5 f34707b;

    public p5(s5 s5Var, int i10) {
        this.f34706a = i10;
        this.f34707b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f34706a) {
            case 0:
                this.f34707b.performClick();
                return;
            default:
                s5 s5Var = this.f34707b;
                s5Var.f34824f.invalidate();
                s5Var.h.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
