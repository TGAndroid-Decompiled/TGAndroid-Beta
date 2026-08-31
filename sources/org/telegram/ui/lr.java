package org.telegram.ui;
public final class lr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.uv0 {
    public final int f38841a;
    public final mr f38842b;

    public lr(mr mrVar, int i10) {
        this.f38841a = i10;
        this.f38842b = mrVar;
    }

    @Override
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        qr qrVar = this.f38842b.d;
        return qrVar.h0(qrVar.f40599a.E(((Integer) b5Var.getTag()).intValue()), !z4, b5Var);
    }

    @Override
    public void i(int i10) {
        boolean z4;
        switch (this.f38841a) {
            case 1:
                qr qrVar = this.f38842b.d;
                if (qrVar.f40640s != null) {
                    int i11 = qrVar.f40627m1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    qrVar.f40627m1 = i10;
                    if (z4) {
                        kr w02 = qrVar.w0();
                        qrVar.B0();
                        qrVar.A0(w02);
                    }
                    qrVar.f40599a.m(qrVar.M0);
                    return;
                }
                return;
            default:
                this.f38842b.d.f40634p1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f38841a;
    }

    private final void a() {
    }

    private final void b() {
    }
}
