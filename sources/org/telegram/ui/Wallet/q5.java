package org.telegram.ui.Wallet;
public final class q5 implements Runnable {
    public final int f35070a;
    public final s5 f35071b;

    public q5(s5 s5Var, int i10) {
        this.f35070a = i10;
        this.f35071b = s5Var;
    }

    @Override
    public final void run() {
        switch (this.f35070a) {
            case 0:
                this.f35071b.performClick();
                return;
            default:
                s5 s5Var = this.f35071b;
                s5Var.h.invalidate();
                s5Var.f35145n.invalidate();
                s5Var.e.invalidate();
                return;
        }
    }
}
