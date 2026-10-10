package org.telegram.ui;
public final class kp0 implements Runnable {
    public final int f39371a;
    public final up0 f39372b;

    public kp0(up0 up0Var, int i10) {
        this.f39371a = i10;
        this.f39372b = up0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39371a;
        up0 up0Var = this.f39372b;
        switch (i10) {
            case 0:
                if (up0Var.G) {
                    up0Var.f42558b.invalidate();
                    return;
                }
                return;
            case 1:
                up0Var.h();
                return;
            case 2:
                int i11 = up0.f42555q0;
                up0Var.h();
                return;
            default:
                int i12 = up0.f42555q0;
                up0Var.h();
                return;
        }
    }
}
