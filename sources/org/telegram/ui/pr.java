package org.telegram.ui;
public final class pr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.tv0 {
    public final int f36715a;
    public final qr f36716b;

    public pr(qr qrVar, int i10) {
        this.f36715a = i10;
        this.f36716b = qrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        ur urVar = this.f36716b.d;
        return urVar.h0(urVar.f38117a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f36715a) {
            case 1:
                ur urVar = this.f36716b.d;
                if (urVar.f38157s != null) {
                    int i11 = urVar.f38151p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    urVar.f38151p1 = i10;
                    if (z10) {
                        or w02 = urVar.w0();
                        urVar.B0();
                        urVar.A0(w02);
                    }
                    urVar.f38117a.m(urVar.P0);
                    return;
                }
                return;
            default:
                this.f36716b.d.f38159s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f36715a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
