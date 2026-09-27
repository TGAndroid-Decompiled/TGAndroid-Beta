package org.telegram.ui.Components;
public final class iw0 implements Runnable {
    public final int f25238a;
    public final kw0 f25239b;

    public iw0(kw0 kw0Var, int i10) {
        this.f25238a = i10;
        this.f25239b = kw0Var;
    }

    @Override
    public final void run() {
        switch (this.f25238a) {
            case 0:
                kw0 kw0Var = this.f25239b;
                kw0Var.V0 = false;
                if (!kw0Var.Y0 && kw0Var.W0) {
                    kw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f25239b.V0 = false;
                return;
            case 2:
                kw0 kw0Var2 = this.f25239b;
                kw0Var2.Y0 = false;
                if (!kw0Var2.V0 && kw0Var2.W0) {
                    kw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f25239b.Y0 = false;
                return;
        }
    }
}
