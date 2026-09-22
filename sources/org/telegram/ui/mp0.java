package org.telegram.ui;
public final class mp0 implements Runnable {
    public final int f35803a;
    public final wp0 f35804b;

    public mp0(wp0 wp0Var, int i10) {
        this.f35803a = i10;
        this.f35804b = wp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35803a;
        wp0 wp0Var = this.f35804b;
        switch (i10) {
            case 0:
                if (wp0Var.G) {
                    wp0Var.f39218b.invalidate();
                    return;
                }
                return;
            case 1:
                wp0Var.h();
                return;
            case 2:
                int i11 = wp0.f39215q0;
                wp0Var.h();
                return;
            default:
                int i12 = wp0.f39215q0;
                wp0Var.h();
                return;
        }
    }
}
