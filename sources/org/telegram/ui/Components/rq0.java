package org.telegram.ui.Components;
public final class rq0 extends g.o {
    public final int f30517c;
    public final or0 d;

    public rq0(or0 or0Var, int i10) {
        this.f30517c = i10;
        this.d = or0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f30517c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                kr0 kr0Var = this.d.M;
                if (i10 != kr0Var.f28071w && i10 != kr0Var.f28072x && i10 != kr0Var.f28073y && i10 != kr0Var.F && kr0Var.j(i10) != 0) {
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
