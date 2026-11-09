package org.telegram.ui;
public final class qi extends gh.b {
    public final int f49064s;
    public final cn f49065w;

    public qi(cn cnVar, org.telegram.ui.ActionBar.g6 g6Var, int i7, int i10) {
        super(i7, g6Var);
        this.f49064s = i10;
        this.f49065w = cnVar;
    }

    @Override
    public final int e1() {
        int i7;
        int i10;
        switch (this.f49064s) {
            case 0:
                cn cnVar = this.f49065w;
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                if (!c8.g0.c(i7, cnVar.f44709za)) {
                    return i0.a.o(cnVar.getThemedColor(org.telegram.ui.ActionBar.l6.Ge), 255);
                }
                an anVar = cnVar.f44709za;
                if (anVar != null && !anVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f49065w.f44674x.e1();
            default:
                cn cnVar2 = this.f49065w;
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar2).currentAccount;
                if (!c8.g0.c(i10, cnVar2.f44709za)) {
                    return i0.a.o(cnVar2.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6), 255);
                }
                an anVar2 = cnVar2.f44709za;
                if (anVar2 != null && !anVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
