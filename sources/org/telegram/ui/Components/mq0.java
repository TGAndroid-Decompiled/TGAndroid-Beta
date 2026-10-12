package org.telegram.ui.Components;
public final class mq0 extends g.o {
    public final int f27474c;
    public final jr0 d;

    public mq0(jr0 jr0Var, int i10) {
        this.f27474c = i10;
        this.d = jr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f27474c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                fr0 fr0Var = this.d.M;
                if (i10 != fr0Var.f25114w && i10 != fr0Var.f25115x && i10 != fr0Var.f25116y && i10 != fr0Var.F && fr0Var.j(i10) != 0) {
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
