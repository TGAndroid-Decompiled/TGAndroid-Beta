package org.telegram.ui;
public final class oi extends gh.b {
    public final int f49964s;
    public final an f49965w;

    public oi(an anVar, org.telegram.ui.ActionBar.e6 e6Var, int i7, int i10) {
        super(i7, e6Var);
        this.f49964s = i10;
        this.f49965w = anVar;
    }

    @Override
    public final int A2() {
        int i7;
        int i10;
        switch (this.f49964s) {
            case 0:
                an anVar = this.f49965w;
                i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                if (!c8.g0.c(i7, anVar.Aa)) {
                    return i0.a.o(anVar.getThemedColor(org.telegram.ui.ActionBar.j6.Je), 255);
                }
                ym ymVar = anVar.Aa;
                if (ymVar != null && !ymVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f49965w.f45415x.A2();
            default:
                an anVar2 = this.f49965w;
                i10 = ((org.telegram.ui.ActionBar.e2) anVar2).currentAccount;
                if (!c8.g0.c(i10, anVar2.Aa)) {
                    return i0.a.o(anVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6), 255);
                }
                ym ymVar2 = anVar2.Aa;
                if (ymVar2 != null && !ymVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
