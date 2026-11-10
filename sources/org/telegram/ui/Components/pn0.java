package org.telegram.ui.Components;
public final class pn0 extends g.p {
    public final int f37045c;
    public final mo0 d;

    public pn0(mo0 mo0Var, int i7) {
        this.f37045c = i7;
        this.d = mo0Var;
    }

    @Override
    public final int i(int i7) {
        switch (this.f37045c) {
            case 0:
                if (i7 == 0) {
                    return this.d.C1.J;
                }
                return 1;
            case 1:
                jo0 jo0Var = this.d.H1;
                if (i7 != jo0Var.f35038x && i7 != jo0Var.f35039y && i7 != jo0Var.D && i7 != jo0Var.F && jo0Var.d(i7) != 0) {
                    return 1;
                }
                return 4;
            default:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
        }
    }
}
