package org.telegram.ui;
public final class kp0 implements Runnable {
    public final int f35239a;
    public final up0 f35240b;

    public kp0(up0 up0Var, int i10) {
        this.f35239a = i10;
        this.f35240b = up0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f35239a;
        up0 up0Var = this.f35240b;
        switch (i10) {
            case 0:
                if (up0Var.G) {
                    up0Var.f38066b.invalidate();
                    return;
                }
                return;
            case 1:
                up0Var.h();
                return;
            case 2:
                int i11 = up0.f38063q0;
                up0Var.h();
                return;
            default:
                int i12 = up0.f38063q0;
                up0Var.h();
                return;
        }
    }
}
