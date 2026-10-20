package org.telegram.ui.Components;
public final class fq0 extends g.o {
    public final int f26339c;
    public final fr0 d;

    public fq0(fr0 fr0Var, int i10) {
        this.f26339c = i10;
        this.d = fr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f26339c) {
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
                br0 br0Var = this.d.N;
                if (i10 != br0Var.f25018w && i10 != br0Var.f25019x && i10 != br0Var.f25020y && i10 != br0Var.F && br0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
        }
    }
}
