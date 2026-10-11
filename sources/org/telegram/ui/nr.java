package org.telegram.ui;
public final class nr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.ww0 {
    public final int f40381a;
    public final or f40382b;

    public nr(or orVar, int i10) {
        this.f40381a = i10;
        this.f40382b = orVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        sr srVar = this.f40382b.d;
        return srVar.h0(srVar.f41818a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f40381a) {
            case 1:
                sr srVar = this.f40382b.d;
                if (srVar.f41859s != null) {
                    int i11 = srVar.f41853p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    srVar.f41853p1 = i10;
                    if (z10) {
                        mr w02 = srVar.w0();
                        srVar.B0();
                        srVar.A0(w02);
                    }
                    srVar.f41818a.m(srVar.P0);
                    return;
                }
                return;
            default:
                this.f40382b.d.f41861s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f40381a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
