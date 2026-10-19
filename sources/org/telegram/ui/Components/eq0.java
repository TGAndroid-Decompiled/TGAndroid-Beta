package org.telegram.ui.Components;
public final class eq0 extends g.o {
    public final int f25970c;
    public final er0 d;

    public eq0(er0 er0Var, int i10) {
        this.f25970c = i10;
        this.d = er0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f25970c) {
            case 0:
                if (i10 == 0) {
                    return this.d.J.J;
                }
                return 1;
            case 1:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
            default:
                ar0 ar0Var = this.d.N;
                if (i10 != ar0Var.f24686w && i10 != ar0Var.f24687x && i10 != ar0Var.f24688y && i10 != ar0Var.F && ar0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
        }
    }
}
