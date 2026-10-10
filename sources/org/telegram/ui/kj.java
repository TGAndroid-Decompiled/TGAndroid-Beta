package org.telegram.ui;
public final class kj extends dh.b {
    public final int f39349n;
    public final zn f39350r;

    public kj(zn znVar, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(i10, e6Var);
        this.f39349n = i11;
        this.f39350r = znVar;
    }

    @Override
    public final int x() {
        int i10;
        int i11;
        switch (this.f39349n) {
            case 0:
                zn znVar = this.f39350r;
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (!eh.b.c(i10, znVar.f44807ea)) {
                    return i0.a.k(znVar.getThemedColor(org.telegram.ui.ActionBar.i6.Sd), 255);
                }
                if (znVar.f44807ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                zn znVar2 = this.f39350r;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                if (!eh.b.c(i11, znVar2.f44807ea)) {
                    return i0.a.k(znVar2.getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6), 255);
                }
                if (znVar2.f44807ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
