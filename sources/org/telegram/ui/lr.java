package org.telegram.ui;
public final class lr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.fw0 {
    public final int f35441a;
    public final mr f35442b;

    public lr(mr mrVar, int i10) {
        this.f35441a = i10;
        this.f35442b = mrVar;
    }

    @Override
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        qr qrVar = this.f35442b.d;
        return qrVar.h0(qrVar.f36817a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override
    public void h(int i10) {
        boolean z10;
        switch (this.f35441a) {
            case 1:
                qr qrVar = this.f35442b.d;
                if (qrVar.f36857s != null) {
                    int i11 = qrVar.f36851p1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qrVar.f36851p1 = i10;
                    if (z10) {
                        kr w02 = qrVar.w0();
                        qrVar.B0();
                        qrVar.A0(w02);
                    }
                    qrVar.f36817a.m(qrVar.P0);
                    return;
                }
                return;
            default:
                this.f35442b.d.f36859s1 = i10 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i10 = this.f35441a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
