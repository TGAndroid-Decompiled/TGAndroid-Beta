package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f24718a;
    public final Object f24719b;

    public hb(Object obj, int i10) {
        this.f24718a = i10;
        this.f24719b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24718a) {
            case 0:
                qc qcVar = (qc) this.f24719b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f24719b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                ip0 ip0Var = (ip0) this.f24719b;
                ip0Var.f25139q = false;
                ip0Var.dismiss();
                return;
            case 3:
                jp0 jp0Var = (jp0) this.f24719b;
                jp0Var.f25469s = false;
                jp0Var.f25468r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == jp0Var.f25466f) {
                    jp0Var.f25466f = null;
                    return;
                }
                return;
            case 4:
                uq0 uq0Var = (uq0) this.f24719b;
                uq0Var.E.setVisibility(8);
                uq0Var.f28907z0.setVisibility(8);
                rq0 rq0Var = uq0Var.L;
                rq0Var.f28030f = null;
                rq0Var.l();
                uq0Var.B0 = null;
                uq0Var.M0 = false;
                return;
            default:
                uq0 uq0Var2 = ((bq0) this.f24719b).d;
                uq0Var2.F.setVisibility(8);
                uq0Var2.G.setVisibility(8);
                uq0Var2.f28906y0.setVisibility(8);
                uq0Var2.B0 = null;
                return;
        }
    }
}
