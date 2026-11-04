package org.telegram.ui.Components;
public final class rn0 extends g.p {
    public final int f37760c;
    public final oo0 d;

    public rn0(oo0 oo0Var, int i3) {
        this.f37760c = i3;
        this.d = oo0Var;
    }

    @Override
    public final int i(int i3) {
        switch (this.f37760c) {
            case 0:
                if (i3 == 0) {
                    return this.d.A1.J;
                }
                return 1;
            case 1:
                lo0 lo0Var = this.d.F1;
                if (i3 != lo0Var.f35806x && i3 != lo0Var.f35807y && i3 != lo0Var.E && i3 != lo0Var.G && lo0Var.d(i3) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i3 == 0) {
                    return this.d.B1.J;
                }
                return 1;
        }
    }
}
