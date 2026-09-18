package org.telegram.ui;
public final class pr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.tv0 {
    public final int f36720a;
    public final qr f36721b;

    public pr(qr qrVar, int i10) {
        this.f36720a = i10;
        this.f36721b = qrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        ur urVar = this.f36721b.d;
        return urVar.h0(urVar.f38122a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f36720a) {
            case 1:
                ur urVar = this.f36721b.d;
                if (urVar.f38162s != null) {
                    int i11 = urVar.f38156p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    urVar.f38156p1 = i10;
                    if (z10) {
                        or w02 = urVar.w0();
                        urVar.B0();
                        urVar.A0(w02);
                    }
                    urVar.f38122a.m(urVar.P0);
                    return;
                }
                return;
            default:
                this.f36721b.d.f38164s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f36720a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
