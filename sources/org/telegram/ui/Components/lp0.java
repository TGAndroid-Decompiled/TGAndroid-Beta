package org.telegram.ui.Components;
public final class lp0 extends g.p {
    public final int f25957c;
    public final iq0 d;

    public lp0(iq0 iq0Var, int i10) {
        this.f25957c = i10;
        this.d = iq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f25957c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                eq0 eq0Var = this.d.M;
                if (i10 != eq0Var.f23650w && i10 != eq0Var.f23651x && i10 != eq0Var.f23652y && i10 != eq0Var.F && eq0Var.j(i10) != 0) {
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
