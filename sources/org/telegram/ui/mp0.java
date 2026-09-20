package org.telegram.ui;
public final class mp0 implements Runnable {
    public final int f35782a;
    public final wp0 f35783b;

    public mp0(wp0 wp0Var, int i10) {
        this.f35782a = i10;
        this.f35783b = wp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35782a;
        wp0 wp0Var = this.f35783b;
        switch (i10) {
            case 0:
                if (wp0Var.G) {
                    wp0Var.f39194b.invalidate();
                    return;
                }
                return;
            case 1:
                wp0Var.h();
                return;
            case 2:
                int i11 = wp0.f39191q0;
                wp0Var.h();
                return;
            default:
                int i12 = wp0.f39191q0;
                wp0Var.h();
                return;
        }
    }
}
