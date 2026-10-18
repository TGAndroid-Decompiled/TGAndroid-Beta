package org.telegram.ui.Components;
public final class gq0 extends g.o {
    public final int f26653c;
    public final dr0 d;

    public gq0(dr0 dr0Var, int i10) {
        this.f26653c = i10;
        this.d = dr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f26653c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                zq0 zq0Var = this.d.M;
                if (i10 != zq0Var.f33006w && i10 != zq0Var.f33007x && i10 != zq0Var.f33008y && i10 != zq0Var.F && zq0Var.j(i10) != 0) {
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
