package org.telegram.ui;
public final class oi extends gh.b {
    public final int f48418s;
    public final an f48419w;

    public oi(an anVar, org.telegram.ui.ActionBar.f6 f6Var, int i7, int i10) {
        super(i7, f6Var);
        this.f48418s = i10;
        this.f48419w = anVar;
    }

    @Override
    public final int e1() {
        int i7;
        int i10;
        switch (this.f48418s) {
            case 0:
                an anVar = this.f48419w;
                i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
                if (!c8.g0.c(i7, anVar.f44023xa)) {
                    return i0.a.o(anVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ge), 255);
                }
                ym ymVar = anVar.f44023xa;
                if (ymVar != null && !ymVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f48419w.f44012x.e1();
            default:
                an anVar2 = this.f48419w;
                i10 = ((org.telegram.ui.ActionBar.f2) anVar2).currentAccount;
                if (!c8.g0.c(i10, anVar2.f44023xa)) {
                    return i0.a.o(anVar2.getThemedColor(org.telegram.ui.ActionBar.k6.f27848d6), 255);
                }
                ym ymVar2 = anVar2.f44023xa;
                if (ymVar2 != null && !ymVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
