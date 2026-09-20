package org.telegram.ui;
public final class nr implements org.telegram.ui.Cells.b5, org.telegram.ui.Components.dw0 {
    public final int f36114a;
    public final or f36115b;

    public nr(or orVar, int i10) {
        this.f36114a = i10;
        this.f36115b = orVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        sr srVar = this.f36115b.d;
        return srVar.h0(srVar.f37447a.E(((Integer) c5Var.getTag()).intValue()), !z10, c5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f36114a) {
            case 1:
                sr srVar = this.f36115b.d;
                if (srVar.f37487s != null) {
                    int i11 = srVar.f37481p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    srVar.f37481p1 = i10;
                    if (z10) {
                        mr w02 = srVar.w0();
                        srVar.B0();
                        srVar.A0(w02);
                    }
                    srVar.f37447a.m(srVar.P0);
                    return;
                }
                return;
            default:
                this.f36115b.d.f37489s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f36114a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
