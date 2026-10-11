package org.telegram.ui;
public final class kj extends dh.b {
    public final int f39381n;
    public final zn f39382r;

    public kj(zn znVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.f39381n = i11;
        this.f39382r = znVar;
    }

    @Override
    public final int x() {
        int i10;
        int i11;
        switch (this.f39381n) {
            case 0:
                zn znVar = this.f39382r;
                i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                if (!eh.b.c(i10, znVar.f44796ea)) {
                    return i0.a.k(znVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sd), 255);
                }
                if (znVar.f44796ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                zn znVar2 = this.f39382r;
                i11 = ((org.telegram.ui.ActionBar.m2) znVar2).currentAccount;
                if (!eh.b.c(i11, znVar2.f44796ea)) {
                    return i0.a.k(znVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6), 255);
                }
                if (znVar2.f44796ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
