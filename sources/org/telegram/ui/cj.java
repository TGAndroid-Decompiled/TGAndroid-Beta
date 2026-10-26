package org.telegram.ui;
public final class cj extends fh.b {
    public final int f38472r;
    public final un f38473s;

    public cj(un unVar, org.telegram.ui.ActionBar.u6 u6Var, int i10, int i11) {
        super(i10, u6Var);
        this.f38472r = i11;
        this.f38473s = unVar;
    }

    @Override
    public final int v0() {
        int i10;
        int i11;
        switch (this.f38472r) {
            case 0:
                un unVar = this.f38473s;
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                if (!gh.c.c(i10, unVar.f44388qa)) {
                    return i0.a.o(unVar.getThemedColor(org.telegram.ui.ActionBar.y6.Sd), 255);
                }
                sn snVar = unVar.f44388qa;
                if (snVar != null && !snVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            default:
                un unVar2 = this.f38473s;
                i11 = ((org.telegram.ui.ActionBar.r2) unVar2).currentAccount;
                if (!gh.c.c(i11, unVar2.f44388qa)) {
                    return i0.a.o(unVar2.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6), 255);
                }
                sn snVar2 = unVar2.f44388qa;
                if (snVar2 != null && !snVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
