package org.telegram.ui.Components;
public final class np0 extends f2.v {
    public final int f29563c;
    public final lq0 d;

    public np0(lq0 lq0Var, int i10) {
        this.f29563c = i10;
        this.d = lq0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f29563c) {
            case 0:
                if (i10 == 0) {
                    return this.d.E.J;
                }
                return 1;
            case 1:
                hq0 hq0Var = this.d.J;
                if (i10 != hq0Var.f27600w && i10 != hq0Var.f27601x && i10 != hq0Var.f27602y && i10 != hq0Var.C && hq0Var.j(i10) != 0) {
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
