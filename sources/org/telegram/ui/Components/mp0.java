package org.telegram.ui.Components;
public final class mp0 extends f2.v {
    public final int f27108c;
    public final lq0 d;

    public mp0(lq0 lq0Var, int i10) {
        this.f27108c = i10;
        this.d = lq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f27108c) {
            case 0:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
            case 1:
                hq0 hq0Var = this.d.J;
                if (i10 != hq0Var.f25481w && i10 != hq0Var.f25482x && i10 != hq0Var.f25483y && i10 != hq0Var.C && hq0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.F.J;
                }
                return 1;
        }
    }
}
