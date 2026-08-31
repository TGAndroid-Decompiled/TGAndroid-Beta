package org.telegram.ui;
public final class fj extends rg.b {
    public final int f36902n;
    public final xn f36903r;

    public fj(xn xnVar, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11) {
        super(i10, g6Var);
        this.f36902n = i11;
        this.f36903r = xnVar;
    }

    @Override
    public final int U() {
        int i10;
        int i11;
        switch (this.f36902n) {
            case 0:
                xn xnVar = this.f36903r;
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                if (!sg.b.c(i10, xnVar.f43136ba)) {
                    return i0.a.k(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.Sd), 255);
                }
                if (xnVar.f43136ba != null && !org.telegram.ui.ActionBar.k6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                xn xnVar2 = this.f36903r;
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                if (!sg.b.c(i11, xnVar2.f43136ba)) {
                    return i0.a.k(xnVar2.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6), 255);
                }
                if (xnVar2.f43136ba != null && !org.telegram.ui.ActionBar.k6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
