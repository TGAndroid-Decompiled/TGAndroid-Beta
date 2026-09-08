package org.telegram.ui;
public final class jj extends eh.b {
    public final int f37810n;
    public final co f37811r;

    public jj(co coVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.f37810n = i11;
        this.f37811r = coVar;
    }

    @Override
    public final int k0() {
        int i10;
        int i11;
        switch (this.f37810n) {
            case 0:
                co coVar = this.f37811r;
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                if (!fh.b.c(i10, coVar.f35274ea)) {
                    return i0.a.k(coVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (coVar.f35274ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                co coVar2 = this.f37811r;
                i11 = ((org.telegram.ui.ActionBar.n2) coVar2).currentAccount;
                if (!fh.b.c(i11, coVar2.f35274ea)) {
                    return i0.a.k(coVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6), 255);
                }
                if (coVar2.f35274ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
