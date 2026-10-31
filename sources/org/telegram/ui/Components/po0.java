package org.telegram.ui.Components;
public final class po0 extends g.o {
    public final int f29394c;
    public final op0 d;

    public po0(op0 op0Var, int i10) {
        this.f29394c = i10;
        this.d = op0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f29394c) {
            case 0:
                if (i10 == 0) {
                    return this.d.f29153z1.J;
                }
                return 1;
            case 1:
                lp0 lp0Var = this.d.E1;
                if (i10 != lp0Var.f28161x && i10 != lp0Var.f28162y && i10 != lp0Var.D && i10 != lp0Var.F && lp0Var.d(i10) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i10 == 0) {
                    return this.d.A1.J;
                }
                return 1;
        }
    }
}
