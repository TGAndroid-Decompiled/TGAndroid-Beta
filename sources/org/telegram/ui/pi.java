package org.telegram.ui;
public final class pi extends gh.b {
    public final int f51028s;
    public final bn f51029w;

    public pi(bn bnVar, org.telegram.ui.ActionBar.i6 i6Var, int i7, int i10) {
        super(i7, i6Var);
        this.f51028s = i10;
        this.f51029w = bnVar;
    }

    @Override
    public final int x2() {
        int i7;
        int i10;
        switch (this.f51028s) {
            case 0:
                bn bnVar = this.f51029w;
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                if (!c8.j0.d(i7, bnVar.Ba)) {
                    return i0.a.o(bnVar.getThemedColor(org.telegram.ui.ActionBar.n6.Je), 255);
                }
                zm zmVar = bnVar.Ba;
                if (zmVar != null && !zmVar.b()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f51029w.f46417x.x2();
            default:
                bn bnVar2 = this.f51029w;
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                if (!c8.j0.d(i10, bnVar2.Ba)) {
                    return i0.a.o(bnVar2.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6), 255);
                }
                zm zmVar2 = bnVar2.Ba;
                if (zmVar2 != null && !zmVar2.b()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
