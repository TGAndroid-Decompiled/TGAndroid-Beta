package org.telegram.ui.Components;
public final class gw0 implements Runnable {
    public final int f24536a;
    public final iw0 f24537b;

    public gw0(iw0 iw0Var, int i10) {
        this.f24536a = i10;
        this.f24537b = iw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24536a) {
            case 0:
                iw0 iw0Var = this.f24537b;
                iw0Var.V0 = false;
                if (!iw0Var.Y0 && iw0Var.W0) {
                    iw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f24537b.V0 = false;
                return;
            case 2:
                iw0 iw0Var2 = this.f24537b;
                iw0Var2.Y0 = false;
                if (!iw0Var2.V0 && iw0Var2.W0) {
                    iw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f24537b.Y0 = false;
                return;
        }
    }
}
