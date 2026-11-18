package org.telegram.ui.Components;
public final class bo0 extends g.p {
    public final int f33752c;
    public final yo0 d;

    public bo0(yo0 yo0Var, int i7) {
        this.f33752c = i7;
        this.d = yo0Var;
    }

    @Override
    public final int i(int i7) {
        switch (this.f33752c) {
            case 0:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
            case 1:
                vo0 vo0Var = this.d.I1;
                if (i7 != vo0Var.f40743x && i7 != vo0Var.f40744y && i7 != vo0Var.E && i7 != vo0Var.G && vo0Var.d(i7) != 0) {
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
