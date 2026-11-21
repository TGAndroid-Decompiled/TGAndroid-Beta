package org.telegram.ui.Components;
public final class do0 extends g.p {
    public final int f34547c;
    public final ap0 d;

    public do0(ap0 ap0Var, int i7) {
        this.f34547c = i7;
        this.d = ap0Var;
    }

    @Override
    public final int i(int i7) {
        switch (this.f34547c) {
            case 0:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
            case 1:
                xo0 xo0Var = this.d.I1;
                if (i7 != xo0Var.f42191x && i7 != xo0Var.f42192y && i7 != xo0Var.E && i7 != xo0Var.G && xo0Var.d(i7) != 0) {
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
