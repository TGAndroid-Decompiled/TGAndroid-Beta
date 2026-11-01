package org.telegram.ui;
public final class kr implements org.telegram.ui.Cells.d5, org.telegram.ui.Components.yu0 {
    public final int f38962a;
    public final lr f38963b;

    public kr(lr lrVar, int i10) {
        this.f38962a = i10;
        this.f38963b = lrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        pr prVar = this.f38963b.d;
        return prVar.m0(prVar.f40525a.E(((Integer) e5Var.getTag()).intValue()), !z10, e5Var);
    }

    @Override
    public void m(int i10) {
        boolean z10;
        switch (this.f38962a) {
            case 1:
                pr prVar = this.f38963b.d;
                if (prVar.f40562r != null) {
                    int i11 = prVar.f40557o1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    prVar.f40557o1 = i10;
                    if (z10) {
                        jr B0 = prVar.B0();
                        prVar.G0();
                        prVar.F0(B0);
                    }
                    prVar.f40525a.g(prVar.O0);
                    return;
                }
                return;
            default:
                this.f38963b.d.f40564r1 = i10 + 1;
                return;
        }
    }

    @Override
    public void r() {
        int i10 = this.f38962a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
