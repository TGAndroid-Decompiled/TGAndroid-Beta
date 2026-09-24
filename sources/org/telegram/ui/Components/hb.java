package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f24711a;
    public final Object f24712b;

    public hb(Object obj, int i10) {
        this.f24711a = i10;
        this.f24712b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24711a) {
            case 0:
                qc qcVar = (qc) this.f24712b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f24712b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                ip0 ip0Var = (ip0) this.f24712b;
                ip0Var.f25112q = false;
                ip0Var.dismiss();
                return;
            case 3:
                jp0 jp0Var = (jp0) this.f24712b;
                jp0Var.f25462s = false;
                jp0Var.f25461r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == jp0Var.f25459f) {
                    jp0Var.f25459f = null;
                    return;
                }
                return;
            case 4:
                uq0 uq0Var = (uq0) this.f24712b;
                uq0Var.E.setVisibility(8);
                uq0Var.f28894z0.setVisibility(8);
                rq0 rq0Var = uq0Var.L;
                rq0Var.f28021f = null;
                rq0Var.l();
                uq0Var.B0 = null;
                uq0Var.M0 = false;
                return;
            default:
                uq0 uq0Var2 = ((bq0) this.f24712b).d;
                uq0Var2.F.setVisibility(8);
                uq0Var2.G.setVisibility(8);
                uq0Var2.f28893y0.setVisibility(8);
                uq0Var2.B0 = null;
                return;
        }
    }
}
