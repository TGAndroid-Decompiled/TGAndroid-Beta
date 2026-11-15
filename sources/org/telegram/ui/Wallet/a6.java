package org.telegram.ui.Wallet;
public final class a6 implements Runnable {
    public final int f43478a;
    public final c6 f43479b;

    public a6(c6 c6Var, int i7) {
        this.f43478a = i7;
        this.f43479b = c6Var;
    }

    @Override
    public final void run() {
        switch (this.f43478a) {
            case 0:
                this.f43479b.performClick();
                return;
            default:
                c6 c6Var = this.f43479b;
                c6Var.h.invalidate();
                c6Var.f43636n.invalidate();
                c6Var.f43626e.invalidate();
                return;
        }
    }
}
