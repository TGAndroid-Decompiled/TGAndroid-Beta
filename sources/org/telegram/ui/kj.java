package org.telegram.ui;
public final class kj extends dh.b {
    public final int f35289n;
    public final bo f35290r;

    public kj(bo boVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.f35289n = i11;
        this.f35290r = boVar;
    }

    @Override
    public final int H() {
        int i10;
        int i11;
        switch (this.f35289n) {
            case 0:
                bo boVar = this.f35290r;
                i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                if (!eh.b.c(i10, boVar.f32275ea)) {
                    return i0.a.k(boVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (boVar.f32275ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                bo boVar2 = this.f35290r;
                i11 = ((org.telegram.ui.ActionBar.o2) boVar2).currentAccount;
                if (!eh.b.c(i11, boVar2.f32275ea)) {
                    return i0.a.k(boVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6), 255);
                }
                if (boVar2.f32275ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
