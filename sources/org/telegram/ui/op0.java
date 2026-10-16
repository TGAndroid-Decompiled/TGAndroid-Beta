package org.telegram.ui;
public final class op0 implements Runnable {
    public final int f38724a;
    public final yp0 f38725b;

    public op0(yp0 yp0Var, int i10) {
        this.f38724a = i10;
        this.f38725b = yp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38724a;
        yp0 yp0Var = this.f38725b;
        switch (i10) {
            case 0:
                if (yp0Var.G) {
                    yp0Var.f41863b.invalidate();
                    return;
                }
                return;
            case 1:
                yp0Var.h();
                return;
            case 2:
                int i11 = yp0.f41860q0;
                yp0Var.h();
                return;
            default:
                int i12 = yp0.f41860q0;
                yp0Var.h();
                return;
        }
    }
}
