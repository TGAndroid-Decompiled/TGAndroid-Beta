package org.telegram.ui;
public final class kr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.dw0 {
    public final int f35128a;
    public final lr f35129b;

    public kr(lr lrVar, int i10) {
        this.f35128a = i10;
        this.f35129b = lrVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        pr prVar = this.f35129b.d;
        return prVar.h0(prVar.f36598a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f35128a) {
            case 1:
                pr prVar = this.f35129b.d;
                if (prVar.f36638s != null) {
                    int i11 = prVar.f36632p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    prVar.f36632p1 = i10;
                    if (z10) {
                        jr w02 = prVar.w0();
                        prVar.B0();
                        prVar.A0(w02);
                    }
                    prVar.f36598a.m(prVar.P0);
                    return;
                }
                return;
            default:
                this.f35129b.d.f36640s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f35128a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
