package org.telegram.ui;
public final class cr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.ow0 {
    public final int f36049a;
    public final dr f36050b;

    public cr(dr drVar, int i10) {
        this.f36049a = i10;
        this.f36050b = drVar;
    }

    @Override
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        hr hrVar = this.f36050b.d;
        return hrVar.h0(hrVar.f37719a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f36049a) {
            case 1:
                hr hrVar = this.f36050b.d;
                if (hrVar.f37759s != null) {
                    int i11 = hrVar.f37753p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    hrVar.f37753p1 = i10;
                    if (z10) {
                        br w02 = hrVar.w0();
                        hrVar.B0();
                        hrVar.A0(w02);
                    }
                    hrVar.f37719a.m(hrVar.P0);
                    return;
                }
                return;
            default:
                this.f36050b.d.f37761s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f36049a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
