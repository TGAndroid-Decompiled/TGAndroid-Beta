package org.telegram.ui.Components;
public final class pw0 implements Runnable {
    public final int f29441a;
    public final rw0 f29442b;

    public pw0(rw0 rw0Var, int i10) {
        this.f29441a = i10;
        this.f29442b = rw0Var;
    }

    @Override
    public final void run() {
        switch (this.f29441a) {
            case 0:
                rw0 rw0Var = this.f29442b;
                rw0Var.V0 = false;
                if (!rw0Var.Y0 && rw0Var.W0) {
                    rw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f29442b.V0 = false;
                return;
            case 2:
                rw0 rw0Var2 = this.f29442b;
                rw0Var2.Y0 = false;
                if (!rw0Var2.V0 && rw0Var2.W0) {
                    rw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f29442b.Y0 = false;
                return;
        }
    }
}
