package org.telegram.ui.Components;
public final class sn0 extends g.p {
    public final int f39382c;
    public final po0 d;

    public sn0(po0 po0Var, int i7) {
        this.f39382c = i7;
        this.d = po0Var;
    }

    @Override
    public final int i(int i7) {
        switch (this.f39382c) {
            case 0:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
            case 1:
                mo0 mo0Var = this.d.I1;
                if (i7 != mo0Var.f37340x && i7 != mo0Var.f37341y && i7 != mo0Var.E && i7 != mo0Var.G && mo0Var.d(i7) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i7 == 0) {
                    return this.d.E1.J;
                }
                return 1;
        }
    }
}
