package org.telegram.ui;
public final class kp0 implements Runnable {
    public final int f39327a;
    public final up0 f39328b;

    public kp0(up0 up0Var, int i10) {
        this.f39327a = i10;
        this.f39328b = up0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f39327a;
        up0 up0Var = this.f39328b;
        switch (i10) {
            case 0:
                if (up0Var.G) {
                    up0Var.f42514b.invalidate();
                    return;
                }
                return;
            case 1:
                up0Var.h();
                return;
            case 2:
                int i11 = up0.f42511q0;
                up0Var.h();
                return;
            default:
                int i12 = up0.f42511q0;
                up0Var.h();
                return;
        }
    }
}
