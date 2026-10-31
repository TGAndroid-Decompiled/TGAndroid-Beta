package org.telegram.ui;
public final class kr implements org.telegram.ui.Cells.d5, org.telegram.ui.Components.xu0 {
    public final int f38928a;
    public final lr f38929b;

    public kr(lr lrVar, int i10) {
        this.f38928a = i10;
        this.f38929b = lrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        pr prVar = this.f38929b.d;
        return prVar.l0(prVar.f40718a.E(((Integer) e5Var.getTag()).intValue()), !z10, e5Var);
    }

    @Override
    public void m(int i10) {
        boolean z10;
        switch (this.f38928a) {
            case 1:
                pr prVar = this.f38929b.d;
                if (prVar.f40755r != null) {
                    int i11 = prVar.f40750o1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    prVar.f40750o1 = i10;
                    if (z10) {
                        jr A0 = prVar.A0();
                        prVar.F0();
                        prVar.E0(A0);
                    }
                    prVar.f40718a.g(prVar.O0);
                    return;
                }
                return;
            default:
                this.f38929b.d.f40757r1 = i10 + 1;
                return;
        }
    }

    @Override
    public void s() {
        int i10 = this.f38928a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
