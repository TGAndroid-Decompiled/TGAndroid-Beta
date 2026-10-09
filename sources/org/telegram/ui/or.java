package org.telegram.ui;
public final class or implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.vw0 {
    public final int f40590a;
    public final pr f40591b;

    public or(pr prVar, int i10) {
        this.f40590a = i10;
        this.f40591b = prVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        tr trVar = this.f40591b.d;
        return trVar.h0(trVar.f42050a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f40590a) {
            case 1:
                tr trVar = this.f40591b.d;
                if (trVar.f42091s != null) {
                    int i11 = trVar.f42085p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    trVar.f42085p1 = i10;
                    if (z10) {
                        mr w02 = trVar.w0();
                        trVar.B0();
                        trVar.A0(w02);
                    }
                    trVar.f42050a.m(trVar.P0);
                    return;
                }
                return;
            default:
                this.f40591b.d.f42093s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f40590a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
