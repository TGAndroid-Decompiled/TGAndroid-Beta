package org.telegram.ui.Components;
public final class qw0 implements Runnable {
    public final int f29729a;
    public final sw0 f29730b;

    public qw0(sw0 sw0Var, int i10) {
        this.f29729a = i10;
        this.f29730b = sw0Var;
    }

    @Override
    public final void run() {
        switch (this.f29729a) {
            case 0:
                sw0 sw0Var = this.f29730b;
                sw0Var.V0 = false;
                if (!sw0Var.Y0 && sw0Var.W0) {
                    sw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f29730b.V0 = false;
                return;
            case 2:
                sw0 sw0Var2 = this.f29730b;
                sw0Var2.Y0 = false;
                if (!sw0Var2.V0 && sw0Var2.W0) {
                    sw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f29730b.Y0 = false;
                return;
        }
    }
}
