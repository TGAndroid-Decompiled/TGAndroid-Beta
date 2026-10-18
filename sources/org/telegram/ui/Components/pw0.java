package org.telegram.ui.Components;
public final class pw0 implements Runnable {
    public final int f29448a;
    public final rw0 f29449b;

    public pw0(rw0 rw0Var, int i10) {
        this.f29448a = i10;
        this.f29449b = rw0Var;
    }

    @Override
    public final void run() {
        switch (this.f29448a) {
            case 0:
                rw0 rw0Var = this.f29449b;
                rw0Var.V0 = false;
                if (!rw0Var.Y0 && rw0Var.W0) {
                    rw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f29449b.V0 = false;
                return;
            case 2:
                rw0 rw0Var2 = this.f29449b;
                rw0Var2.Y0 = false;
                if (!rw0Var2.V0 && rw0Var2.W0) {
                    rw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f29449b.Y0 = false;
                return;
        }
    }
}
