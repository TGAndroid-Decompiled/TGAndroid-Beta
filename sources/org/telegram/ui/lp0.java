package org.telegram.ui;
public final class lp0 implements Runnable {
    public final int f38480a;
    public final vp0 f38481b;

    public lp0(vp0 vp0Var, int i10) {
        this.f38480a = i10;
        this.f38481b = vp0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f38480a;
        vp0 vp0Var = this.f38481b;
        switch (i10) {
            case 0:
                if (vp0Var.G) {
                    vp0Var.f41628b.invalidate();
                    return;
                }
                return;
            case 1:
                vp0Var.h();
                return;
            case 2:
                int i11 = vp0.f41625q0;
                vp0Var.h();
                return;
            default:
                int i12 = vp0.f41625q0;
                vp0Var.h();
                return;
        }
    }
}
