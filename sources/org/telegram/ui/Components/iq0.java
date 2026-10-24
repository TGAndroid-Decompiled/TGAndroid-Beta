package org.telegram.ui.Components;
public final class iq0 extends g.o {
    public final int f27472c;
    public final hr0 d;

    public iq0(hr0 hr0Var, int i10) {
        this.f27472c = i10;
        this.d = hr0Var;
    }

    @Override
    public final int i(int i10) {
        switch (this.f27472c) {
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
                dr0 dr0Var = this.d.N;
                if (i10 != dr0Var.f25817w && i10 != dr0Var.f25818x && i10 != dr0Var.f25819y && i10 != dr0Var.F && dr0Var.j(i10) != 0) {
                    return 1;
                }
                return 4;
        }
    }
}
