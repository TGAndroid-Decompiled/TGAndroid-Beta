package org.telegram.ui;
public final class kp0 implements Runnable {
    public final int f34435a;
    public final up0 f34436b;

    public kp0(up0 up0Var, int i10) {
        this.f34435a = i10;
        this.f34436b = up0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f34435a;
        up0 up0Var = this.f34436b;
        switch (i10) {
            case 0:
                if (up0Var.G) {
                    up0Var.f37307b.invalidate();
                    return;
                }
                return;
            case 1:
                up0Var.h();
                return;
            case 2:
                int i11 = up0.f37304q0;
                up0Var.h();
                return;
            default:
                int i12 = up0.f37304q0;
                up0Var.h();
                return;
        }
    }
}
