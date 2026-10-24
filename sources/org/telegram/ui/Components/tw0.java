package org.telegram.ui.Components;
public final class tw0 implements Runnable {
    public final int f30907a;
    public final vw0 f30908b;

    public tw0(vw0 vw0Var, int i10) {
        this.f30907a = i10;
        this.f30908b = vw0Var;
    }

    @Override
    public final void run() {
        switch (this.f30907a) {
            case 0:
                vw0 vw0Var = this.f30908b;
                vw0Var.V0 = false;
                if (!vw0Var.Y0 && vw0Var.W0) {
                    vw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f30908b.V0 = false;
                return;
            case 2:
                vw0 vw0Var2 = this.f30908b;
                vw0Var2.Y0 = false;
                if (!vw0Var2.V0 && vw0Var2.W0) {
                    vw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f30908b.Y0 = false;
                return;
        }
    }
}
