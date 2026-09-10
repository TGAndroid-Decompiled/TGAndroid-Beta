package org.telegram.ui.Components;
public final class up0 extends g.p {
    public final int f27736c;
    public final sq0 d;

    public up0(sq0 sq0Var, int i10) {
        this.f27736c = i10;
        this.d = sq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f27736c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                oq0 oq0Var = this.d.M;
                if (i10 != oq0Var.f25890w && i10 != oq0Var.f25891x && i10 != oq0Var.f25892y && i10 != oq0Var.F && oq0Var.j(i10) != 0) {
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
