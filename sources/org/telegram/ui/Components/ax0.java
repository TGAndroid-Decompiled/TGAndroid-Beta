package org.telegram.ui.Components;
public final class ax0 implements Runnable {
    public final int f24612a;
    public final cx0 f24613b;

    public ax0(cx0 cx0Var, int i10) {
        this.f24612a = i10;
        this.f24613b = cx0Var;
    }

    @Override
    public final void run() {
        switch (this.f24612a) {
            case 0:
                cx0 cx0Var = this.f24613b;
                cx0Var.V0 = false;
                if (!cx0Var.Y0 && cx0Var.W0) {
                    cx0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f24613b.V0 = false;
                return;
            case 2:
                cx0 cx0Var2 = this.f24613b;
                cx0Var2.Y0 = false;
                if (!cx0Var2.V0 && cx0Var2.W0) {
                    cx0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f24613b.Y0 = false;
                return;
        }
    }
}
