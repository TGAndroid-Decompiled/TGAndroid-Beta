package org.telegram.ui.Components;
public final class yt0 implements Runnable {
    public final int f42156a;
    public final au0 f42157b;

    public yt0(au0 au0Var, int i7) {
        this.f42156a = i7;
        this.f42157b = au0Var;
    }

    @Override
    public final void run() {
        switch (this.f42156a) {
            case 0:
                au0 au0Var = this.f42157b;
                au0Var.W0 = false;
                if (!au0Var.Z0 && au0Var.X0) {
                    au0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f42157b.W0 = false;
                return;
            case 2:
                au0 au0Var2 = this.f42157b;
                au0Var2.Z0 = false;
                if (!au0Var2.W0 && au0Var2.X0) {
                    au0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f42157b.Z0 = false;
                return;
        }
    }
}
