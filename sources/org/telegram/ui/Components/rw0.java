package org.telegram.ui.Components;
public final class rw0 implements Runnable {
    public final int f30517a;
    public final tw0 f30518b;

    public rw0(tw0 tw0Var, int i10) {
        this.f30517a = i10;
        this.f30518b = tw0Var;
    }

    @Override
    public final void run() {
        switch (this.f30517a) {
            case 0:
                tw0 tw0Var = this.f30518b;
                tw0Var.V0 = false;
                if (!tw0Var.Y0 && tw0Var.W0) {
                    tw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f30518b.V0 = false;
                return;
            case 2:
                tw0 tw0Var2 = this.f30518b;
                tw0Var2.Y0 = false;
                if (!tw0Var2.V0 && tw0Var2.W0) {
                    tw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f30518b.Y0 = false;
                return;
        }
    }
}
