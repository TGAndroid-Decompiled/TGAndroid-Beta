package org.telegram.ui.Components;
public final class qn0 extends g.p {
    public final int f37446c;
    public final no0 d;

    public qn0(no0 no0Var, int i7) {
        this.f37446c = i7;
        this.d = no0Var;
    }

    @Override
    public final int i(int i7) {
        switch (this.f37446c) {
            case 0:
                if (i7 == 0) {
                    return this.d.f36469z1.J;
                }
                return 1;
            case 1:
                ko0 ko0Var = this.d.E1;
                if (i7 != ko0Var.f35447x && i7 != ko0Var.f35448y && i7 != ko0Var.D && i7 != ko0Var.F && ko0Var.d(i7) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i7 == 0) {
                    return this.d.A1.J;
                }
                return 1;
        }
    }
}
