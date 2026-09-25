package org.telegram.ui.Components;
public final class xp0 extends g.p {
    public final int f30385c;
    public final uq0 d;

    public xp0(uq0 uq0Var, int i10) {
        this.f30385c = i10;
        this.d = uq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f30385c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                qq0 qq0Var = this.d.M;
                if (i10 != qq0Var.f27747w && i10 != qq0Var.f27748x && i10 != qq0Var.f27749y && i10 != qq0Var.F && qq0Var.j(i10) != 0) {
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
