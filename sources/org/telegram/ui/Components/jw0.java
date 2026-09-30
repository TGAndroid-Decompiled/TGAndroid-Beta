package org.telegram.ui.Components;
public final class jw0 implements Runnable {
    public final int f25559a;
    public final lw0 f25560b;

    public jw0(lw0 lw0Var, int i10) {
        this.f25559a = i10;
        this.f25560b = lw0Var;
    }

    @Override
    public final void run() {
        switch (this.f25559a) {
            case 0:
                lw0 lw0Var = this.f25560b;
                lw0Var.V0 = false;
                if (!lw0Var.Y0 && lw0Var.W0) {
                    lw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f25560b.V0 = false;
                return;
            case 2:
                lw0 lw0Var2 = this.f25560b;
                lw0Var2.Y0 = false;
                if (!lw0Var2.V0 && lw0Var2.W0) {
                    lw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f25560b.Y0 = false;
                return;
        }
    }
}
