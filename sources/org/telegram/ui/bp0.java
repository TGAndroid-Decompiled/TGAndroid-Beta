package org.telegram.ui;
public final class bp0 implements Runnable {
    public final int f38131a;
    public final lp0 f38132b;

    public bp0(lp0 lp0Var, int i10) {
        this.f38131a = i10;
        this.f38132b = lp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38131a;
        lp0 lp0Var = this.f38132b;
        switch (i10) {
            case 0:
                if (lp0Var.G) {
                    lp0Var.f41313b.invalidate();
                    return;
                }
                return;
            case 1:
                lp0Var.h();
                return;
            case 2:
                int i11 = lp0.f41310q0;
                lp0Var.h();
                return;
            default:
                int i12 = lp0.f41310q0;
                lp0Var.h();
                return;
        }
    }
}
