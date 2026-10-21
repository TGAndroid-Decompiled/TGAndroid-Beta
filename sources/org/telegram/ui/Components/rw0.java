package org.telegram.ui.Components;
public final class rw0 implements Runnable {
    public final int f30030a;
    public final tw0 f30031b;

    public rw0(tw0 tw0Var, int i10) {
        this.f30030a = i10;
        this.f30031b = tw0Var;
    }

    @Override
    public final void run() {
        switch (this.f30030a) {
            case 0:
                tw0 tw0Var = this.f30031b;
                tw0Var.V0 = false;
                if (!tw0Var.Y0 && tw0Var.W0) {
                    tw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f30031b.V0 = false;
                return;
            case 2:
                tw0 tw0Var2 = this.f30031b;
                tw0Var2.Y0 = false;
                if (!tw0Var2.V0 && tw0Var2.W0) {
                    tw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f30031b.Y0 = false;
                return;
        }
    }
}
