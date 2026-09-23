package org.telegram.ui.Components;
public final class vv0 implements Runnable {
    public final int f29404a;
    public final xv0 f29405b;

    public vv0(xv0 xv0Var, int i10) {
        this.f29404a = i10;
        this.f29405b = xv0Var;
    }

    @Override
    public final void run() {
        switch (this.f29404a) {
            case 0:
                xv0 xv0Var = this.f29405b;
                xv0Var.V0 = false;
                if (!xv0Var.Y0 && xv0Var.W0) {
                    xv0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f29405b.V0 = false;
                return;
            case 2:
                xv0 xv0Var2 = this.f29405b;
                xv0Var2.Y0 = false;
                if (!xv0Var2.V0 && xv0Var2.W0) {
                    xv0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f29405b.Y0 = false;
                return;
        }
    }
}
