package org.telegram.ui.Components;
public final class zp0 extends g.p {
    public final int f30944c;
    public final wq0 d;

    public zp0(wq0 wq0Var, int i10) {
        this.f30944c = i10;
        this.d = wq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f30944c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                sq0 sq0Var = this.d.M;
                if (i10 != sq0Var.f28343w && i10 != sq0Var.f28344x && i10 != sq0Var.f28345y && i10 != sq0Var.F && sq0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
