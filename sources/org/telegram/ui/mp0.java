package org.telegram.ui;
public final class mp0 implements Runnable {
    public final int f40106a;
    public final wp0 f40107b;

    public mp0(wp0 wp0Var, int i10) {
        this.f40106a = i10;
        this.f40107b = wp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f40106a;
        wp0 wp0Var = this.f40107b;
        switch (i10) {
            case 0:
                if (wp0Var.G) {
                    wp0Var.f43584b.invalidate();
                    return;
                }
                return;
            case 1:
                wp0Var.h();
                return;
            case 2:
                int i11 = wp0.f43581q0;
                wp0Var.h();
                return;
            default:
                int i12 = wp0.f43581q0;
                wp0Var.h();
                return;
        }
    }
}
