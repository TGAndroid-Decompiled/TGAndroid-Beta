package org.telegram.ui;
public final class mp0 implements Runnable {
    public final int f35860a;
    public final wp0 f35861b;

    public mp0(wp0 wp0Var, int i10) {
        this.f35860a = i10;
        this.f35861b = wp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35860a;
        wp0 wp0Var = this.f35861b;
        switch (i10) {
            case 0:
                if (wp0Var.G) {
                    wp0Var.f39130b.invalidate();
                    return;
                }
                return;
            case 1:
                wp0Var.h();
                return;
            case 2:
                int i11 = wp0.f39127q0;
                wp0Var.h();
                return;
            default:
                int i12 = wp0.f39127q0;
                wp0Var.h();
                return;
        }
    }
}
