package org.telegram.ui.Components;
public final class gw0 implements Runnable {
    public final int f24467a;
    public final iw0 f24468b;

    public gw0(iw0 iw0Var, int i10) {
        this.f24467a = i10;
        this.f24468b = iw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24467a) {
            case 0:
                iw0 iw0Var = this.f24468b;
                iw0Var.V0 = false;
                if (!iw0Var.Y0 && iw0Var.W0) {
                    iw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f24468b.V0 = false;
                return;
            case 2:
                iw0 iw0Var2 = this.f24468b;
                iw0Var2.Y0 = false;
                if (!iw0Var2.V0 && iw0Var2.W0) {
                    iw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f24468b.Y0 = false;
                return;
        }
    }
}
