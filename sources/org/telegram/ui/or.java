package org.telegram.ui;
public final class or implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.ww0 {
    public final int f40636a;
    public final pr f40637b;

    public or(pr prVar, int i10) {
        this.f40636a = i10;
        this.f40637b = prVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        tr trVar = this.f40637b.d;
        return trVar.h0(trVar.f42096a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f40636a) {
            case 1:
                tr trVar = this.f40637b.d;
                if (trVar.f42137s != null) {
                    int i11 = trVar.f42131p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    trVar.f42131p1 = i10;
                    if (z10) {
                        mr w02 = trVar.w0();
                        trVar.B0();
                        trVar.A0(w02);
                    }
                    trVar.f42096a.m(trVar.P0);
                    return;
                }
                return;
            default:
                this.f40637b.d.f42139s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f40636a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
