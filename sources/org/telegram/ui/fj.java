package org.telegram.ui;
public final class fj extends fh.b {
    public final int f39389r;
    public final wn f39390s;

    public fj(wn wnVar, org.telegram.ui.ActionBar.u6 u6Var, int i10, int i11) {
        super(i10, u6Var);
        this.f39389r = i11;
        this.f39390s = wnVar;
    }

    @Override
    public final int v0() {
        int i10;
        int i11;
        switch (this.f39389r) {
            case 0:
                wn wnVar = this.f39390s;
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                if (!gh.c.c(i10, wnVar.f45309ua)) {
                    return i0.a.o(wnVar.getThemedColor(org.telegram.ui.ActionBar.y6.Sd), 255);
                }
                un unVar = wnVar.f45309ua;
                if (unVar != null && !unVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            default:
                wn wnVar2 = this.f39390s;
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar2).currentAccount;
                if (!gh.c.c(i11, wnVar2.f45309ua)) {
                    return i0.a.o(wnVar2.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6), 255);
                }
                un unVar2 = wnVar2.f45309ua;
                if (unVar2 != null && !unVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
