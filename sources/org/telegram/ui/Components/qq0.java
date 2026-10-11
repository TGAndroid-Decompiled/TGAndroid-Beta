package org.telegram.ui.Components;
public final class qq0 extends g.o {
    public final int f30299c;
    public final nr0 d;

    public qq0(nr0 nr0Var, int i10) {
        this.f30299c = i10;
        this.d = nr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f30299c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                jr0 jr0Var = this.d.M;
                if (i10 != jr0Var.f27828w && i10 != jr0Var.f27829x && i10 != jr0Var.f27830y && i10 != jr0Var.F && jr0Var.j(i10) != 0) {
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
