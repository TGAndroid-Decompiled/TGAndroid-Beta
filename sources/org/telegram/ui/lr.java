package org.telegram.ui;
public final class lr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.sv0 {
    public final int f35079a;
    public final mr f35080b;

    public lr(mr mrVar, int i10) {
        this.f35079a = i10;
        this.f35080b = mrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        qr qrVar = this.f35080b.d;
        return qrVar.h0(qrVar.f36545a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void g(int i10) {
        boolean z10;
        switch (this.f35079a) {
            case 1:
                qr qrVar = this.f35080b.d;
                if (qrVar.f36585s != null) {
                    int i11 = qrVar.f36579p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qrVar.f36579p1 = i10;
                    if (z10) {
                        kr w02 = qrVar.w0();
                        qrVar.B0();
                        qrVar.A0(w02);
                    }
                    qrVar.f36545a.m(qrVar.P0);
                    return;
                }
                return;
            default:
                this.f35080b.d.f36587s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void l() {
        int i10 = this.f35079a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
