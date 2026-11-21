package org.telegram.ui;
public final class pi extends gh.b {
    public final int f50883s;
    public final bn f50884w;

    public pi(bn bnVar, org.telegram.ui.ActionBar.h6 h6Var, int i7, int i10) {
        super(i7, h6Var);
        this.f50883s = i10;
        this.f50884w = bnVar;
    }

    @Override
    public final int A2() {
        int i7;
        int i10;
        switch (this.f50883s) {
            case 0:
                bn bnVar = this.f50884w;
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                if (!c8.i0.d(i7, bnVar.Ba)) {
                    return i0.a.o(bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.Je), 255);
                }
                zm zmVar = bnVar.Ba;
                if (zmVar != null && !zmVar.d()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f50884w.f46245x.A2();
            default:
                bn bnVar2 = this.f50884w;
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                if (!c8.i0.d(i10, bnVar2.Ba)) {
                    return i0.a.o(bnVar2.getThemedColor(org.telegram.ui.ActionBar.m6.f29378d6), 255);
                }
                zm zmVar2 = bnVar2.Ba;
                if (zmVar2 != null && !zmVar2.d()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
