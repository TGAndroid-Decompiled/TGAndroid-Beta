package org.telegram.ui;
public final class oj extends dh.b {
    public final int f40732n;
    public final eo f40733r;

    public oj(eo eoVar, org.telegram.ui.ActionBar.c6 c6Var, int i10, int i11) {
        super(i10, c6Var);
        this.f40732n = i11;
        this.f40733r = eoVar;
    }

    @Override
    public final int C() {
        int i10;
        int i11;
        switch (this.f40732n) {
            case 0:
                eo eoVar = this.f40733r;
                i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                if (!eh.b.c(i10, eoVar.f37256ea)) {
                    return i0.a.k(eoVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sd), 255);
                }
                if (eoVar.f37256ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                eo eoVar2 = this.f40733r;
                i11 = ((org.telegram.ui.ActionBar.m2) eoVar2).currentAccount;
                if (!eh.b.c(i11, eoVar2.f37256ea)) {
                    return i0.a.k(eoVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20560d6), 255);
                }
                if (eoVar2.f37256ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
