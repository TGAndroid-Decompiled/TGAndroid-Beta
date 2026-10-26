package org.telegram.ui;
public final class bp0 implements Runnable {
    public final int f38134a;
    public final lp0 f38135b;

    public bp0(lp0 lp0Var, int i10) {
        this.f38134a = i10;
        this.f38135b = lp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38134a;
        lp0 lp0Var = this.f38135b;
        switch (i10) {
            case 0:
                if (lp0Var.G) {
                    lp0Var.f41316b.invalidate();
                    return;
                }
                return;
            case 1:
                lp0Var.h();
                return;
            case 2:
                int i11 = lp0.f41313q0;
                lp0Var.h();
                return;
            default:
                int i12 = lp0.f41313q0;
                lp0Var.h();
                return;
        }
    }
}
