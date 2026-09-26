package org.telegram.ui;
public final class gj extends dh.b {
    public final int f33951n;
    public final wn f33952r;

    public gj(wn wnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.f33951n = i11;
        this.f33952r = wnVar;
    }

    @Override
    public final int H() {
        int i10;
        int i11;
        switch (this.f33951n) {
            case 0:
                wn wnVar = this.f33952r;
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                if (!eh.b.c(i10, wnVar.f39468ea)) {
                    return i0.a.k(wnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sd), 255);
                }
                if (wnVar.f39468ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                wn wnVar2 = this.f33952r;
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar2).currentAccount;
                if (!eh.b.c(i11, wnVar2.f39468ea)) {
                    return i0.a.k(wnVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f19059d6), 255);
                }
                if (wnVar2.f39468ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
