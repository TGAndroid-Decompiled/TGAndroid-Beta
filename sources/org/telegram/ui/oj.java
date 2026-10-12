package org.telegram.ui;
public final class oj extends eh.b {
    public final int f38985n;
    public final fo f38986r;

    public oj(fo foVar, org.telegram.ui.ActionBar.c6 c6Var, int i10, int i11) {
        super(i10, c6Var);
        this.f38985n = i11;
        this.f38986r = foVar;
    }

    @Override
    public final int b0() {
        int i10;
        int i11;
        switch (this.f38985n) {
            case 0:
                fo foVar = this.f38986r;
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                if (!fh.b.c(i10, foVar.f35932ea)) {
                    return i0.a.k(foVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sd), 255);
                }
                if (foVar.f35932ea != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                fo foVar2 = this.f38986r;
                i11 = ((org.telegram.ui.ActionBar.m2) foVar2).currentAccount;
                if (!fh.b.c(i11, foVar2.f35932ea)) {
                    return i0.a.k(foVar2.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6), 255);
                }
                if (foVar2.f35932ea != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
