package org.telegram.ui;
public final class hj extends qg.b {
    public final int f34684n;
    public final zn f34685r;

    public hj(zn znVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.f34684n = i11;
        this.f34685r = znVar;
    }

    @Override
    public final int m0() {
        int i10;
        int i11;
        switch (this.f34684n) {
            case 0:
                zn znVar = this.f34685r;
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                if (!rg.b.c(i10, znVar.f40534ba)) {
                    return i0.a.k(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (znVar.f40534ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                zn znVar2 = this.f34685r;
                i11 = ((org.telegram.ui.ActionBar.p2) znVar2).currentAccount;
                if (!rg.b.c(i11, znVar2.f40534ba)) {
                    return i0.a.k(znVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6), 255);
                }
                if (znVar2.f40534ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
