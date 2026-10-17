package org.telegram.ui;
public final class dj extends eh.b {
    public final int f36207n;
    public final sn f36208r;

    public dj(sn snVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.f36207n = i11;
        this.f36208r = snVar;
    }

    @Override
    public final int a0() {
        int i10;
        int i11;
        switch (this.f36207n) {
            case 0:
                sn snVar = this.f36208r;
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                if (!fh.c.c(i10, snVar.f41205ea)) {
                    return i0.b.o(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sd), 255);
                }
                if (snVar.f41205ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.b.o(this.d, 216);
                }
                return this.d;
            default:
                sn snVar2 = this.f36208r;
                i11 = ((org.telegram.ui.ActionBar.n2) snVar2).currentAccount;
                if (!fh.c.c(i11, snVar2.f41205ea)) {
                    return i0.b.o(snVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20986d6), 255);
                }
                if (snVar2.f41205ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.b.o(this.d, 216);
                }
                return this.d;
        }
    }
}
