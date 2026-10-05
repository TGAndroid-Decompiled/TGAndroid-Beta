package org.telegram.ui.Components;
public final class cq0 extends g.p {
    public final int f25502c;
    public final br0 d;

    public cq0(br0 br0Var, int i10) {
        this.f25502c = i10;
        this.d = br0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f25502c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                xq0 xq0Var = this.d.M;
                if (i10 != xq0Var.f33068w && i10 != xq0Var.f33069x && i10 != xq0Var.f33070y && i10 != xq0Var.F && xq0Var.j(i10) != 0) {
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
