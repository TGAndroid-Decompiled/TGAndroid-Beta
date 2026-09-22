package org.telegram.ui;
public final class kp0 implements Runnable {
    public final int f35232a;
    public final up0 f35233b;

    public kp0(up0 up0Var, int i10) {
        this.f35232a = i10;
        this.f35233b = up0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35232a;
        up0 up0Var = this.f35233b;
        switch (i10) {
            case 0:
                if (up0Var.G) {
                    up0Var.f38080b.invalidate();
                    return;
                }
                return;
            case 1:
                up0Var.h();
                return;
            case 2:
                int i11 = up0.f38077q0;
                up0Var.h();
                return;
            default:
                int i12 = up0.f38077q0;
                up0Var.h();
                return;
        }
    }
}
