package org.telegram.ui;
public final class kr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.gw0 {
    public final int f35250a;
    public final lr f35251b;

    public kr(lr lrVar, int i10) {
        this.f35250a = i10;
        this.f35251b = lrVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        pr prVar = this.f35251b.d;
        return prVar.h0(prVar.f36709a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f35250a) {
            case 1:
                pr prVar = this.f35251b.d;
                if (prVar.f36749s != null) {
                    int i11 = prVar.f36743p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    prVar.f36743p1 = i10;
                    if (z10) {
                        jr w02 = prVar.w0();
                        prVar.B0();
                        prVar.A0(w02);
                    }
                    prVar.f36709a.m(prVar.P0);
                    return;
                }
                return;
            default:
                this.f35251b.d.f36751s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f35250a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
