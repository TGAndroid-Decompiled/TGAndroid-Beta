package org.telegram.ui;
public final class mp0 implements Runnable {
    public final int f35865a;
    public final wp0 f35866b;

    public mp0(wp0 wp0Var, int i10) {
        this.f35865a = i10;
        this.f35866b = wp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35865a;
        wp0 wp0Var = this.f35866b;
        switch (i10) {
            case 0:
                if (wp0Var.G) {
                    wp0Var.f39135b.invalidate();
                    return;
                }
                return;
            case 1:
                wp0Var.h();
                return;
            case 2:
                int i11 = wp0.f39132q0;
                wp0Var.h();
                return;
            default:
                int i12 = wp0.f39132q0;
                wp0Var.h();
                return;
        }
    }
}
