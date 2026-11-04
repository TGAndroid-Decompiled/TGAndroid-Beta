package org.telegram.ui;
public final class ki extends hh.b {
    public final int f46949s;
    public final wm f46950w;

    public ki(wm wmVar, org.telegram.ui.ActionBar.e6 e6Var, int i3, int i10) {
        super(i3, e6Var);
        this.f46949s = i10;
        this.f46950w = wmVar;
    }

    @Override
    public final int w0() {
        int i3;
        int i10;
        switch (this.f46949s) {
            case 0:
                wm wmVar = this.f46950w;
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                if (!b8.cd.c(i3, wmVar.f51557ya)) {
                    return i0.a.o(wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.Ge), 255);
                }
                um umVar = wmVar.f51557ya;
                if (umVar != null && !umVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f46950w.f51534x.w0();
            default:
                wm wmVar2 = this.f46950w;
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar2).currentAccount;
                if (!b8.cd.c(i10, wmVar2.f51557ya)) {
                    return i0.a.o(wmVar2.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6), 255);
                }
                um umVar2 = wmVar2.f51557ya;
                if (umVar2 != null && !umVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
