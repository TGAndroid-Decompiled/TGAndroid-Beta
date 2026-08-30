package org.telegram.ui.Components;
public final class np0 extends f2.v {
    public final int f27334c;
    public final lq0 d;

    public np0(lq0 lq0Var, int i10) {
        this.f27334c = i10;
        this.d = lq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f27334c) {
            case 0:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
            case 1:
                hq0 hq0Var = this.d.J;
                if (i10 != hq0Var.f25474w && i10 != hq0Var.f25475x && i10 != hq0Var.f25476y && i10 != hq0Var.C && hq0Var.j(i10) != 0) {
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
