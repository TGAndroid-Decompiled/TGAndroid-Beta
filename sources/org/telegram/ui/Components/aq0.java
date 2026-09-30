package org.telegram.ui.Components;
public final class aq0 extends g.p {
    public final int f22688c;
    public final xq0 d;

    public aq0(xq0 xq0Var, int i10) {
        this.f22688c = i10;
        this.d = xq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f22688c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                tq0 tq0Var = this.d.M;
                if (i10 != tq0Var.f28633w && i10 != tq0Var.f28634x && i10 != tq0Var.f28635y && i10 != tq0Var.F && tq0Var.j(i10) != 0) {
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
