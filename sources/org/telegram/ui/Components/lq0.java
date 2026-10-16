package org.telegram.ui.Components;
public final class lq0 extends g.o {
    public final int f26801c;
    public final ir0 d;

    public lq0(ir0 ir0Var, int i10) {
        this.f26801c = i10;
        this.d = ir0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f26801c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                er0 er0Var = this.d.M;
                if (i10 != er0Var.f24462w && i10 != er0Var.f24463x && i10 != er0Var.f24464y && i10 != er0Var.F && er0Var.j(i10) != 0) {
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
