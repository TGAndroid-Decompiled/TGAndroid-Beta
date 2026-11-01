package org.telegram.ui.Components;
public final class qo0 extends g.o {
    public final int f29765c;
    public final pp0 d;

    public qo0(pp0 pp0Var, int i10) {
        this.f29765c = i10;
        this.d = pp0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f29765c) {
            case 0:
                if (i10 == 0) {
                    return this.d.f29508z1.J;
                }
                return 1;
            case 1:
                mp0 mp0Var = this.d.E1;
                if (i10 != mp0Var.f28533x && i10 != mp0Var.f28534y && i10 != mp0Var.D && i10 != mp0Var.F && mp0Var.d(i10) != 0) {
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
