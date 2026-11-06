package org.telegram.ui.Components;
public final class pn0 extends g.p {
    public final int f37133c;
    public final mo0 d;

    public pn0(mo0 mo0Var, int i7) {
        this.f37133c = i7;
        this.d = mo0Var;
    }

    @Override
    public final int i(int i7) {
        switch (this.f37133c) {
            case 0:
                if (i7 == 0) {
                    return this.d.f36093z1.J;
                }
                return 1;
            case 1:
                jo0 jo0Var = this.d.E1;
                if (i7 != jo0Var.f35050x && i7 != jo0Var.f35051y && i7 != jo0Var.D && i7 != jo0Var.F && jo0Var.d(i7) != 0) {
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
