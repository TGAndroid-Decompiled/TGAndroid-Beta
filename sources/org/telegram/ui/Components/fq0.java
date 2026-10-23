package org.telegram.ui.Components;
public final class fq0 extends g.o {
    public final int f26343c;
    public final fr0 d;

    public fq0(fr0 fr0Var, int i10) {
        this.f26343c = i10;
        this.d = fr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f26343c) {
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
                if (i10 != br0Var.f25022w && i10 != br0Var.f25023x && i10 != br0Var.f25024y && i10 != br0Var.F && br0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
        }
    }
}
