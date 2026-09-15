package org.telegram.ui;
public final class jj extends dh.b {
    public final int f34913n;
    public final bo f34914r;

    public jj(bo boVar, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(i10, e6Var);
        this.f34913n = i11;
        this.f34914r = boVar;
    }

    @Override
    public final int H() {
        int i10;
        int i11;
        switch (this.f34913n) {
            case 0:
                bo boVar = this.f34914r;
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                if (!eh.b.c(i10, boVar.f32297ea)) {
                    return i0.a.k(boVar.getThemedColor(org.telegram.ui.ActionBar.i6.Sd), 255);
                }
                if (boVar.f32297ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                bo boVar2 = this.f34914r;
                i11 = ((org.telegram.ui.ActionBar.n2) boVar2).currentAccount;
                if (!eh.b.c(i11, boVar2.f32297ea)) {
                    return i0.a.k(boVar2.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6), 255);
                }
                if (boVar2.f32297ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
