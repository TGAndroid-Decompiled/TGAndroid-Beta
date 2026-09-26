package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f24717a;
    public final Object f24718b;

    public hb(Object obj, int i10) {
        this.f24717a = i10;
        this.f24718b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24717a) {
            case 0:
                qc qcVar = (qc) this.f24718b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f24718b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                ip0 ip0Var = (ip0) this.f24718b;
                ip0Var.f25138q = false;
                ip0Var.dismiss();
                return;
            case 3:
                jp0 jp0Var = (jp0) this.f24718b;
                jp0Var.f25468s = false;
                jp0Var.f25467r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == jp0Var.f25465f) {
                    jp0Var.f25465f = null;
                    return;
                }
                return;
            case 4:
                uq0 uq0Var = (uq0) this.f24718b;
                uq0Var.E.setVisibility(8);
                uq0Var.f28906z0.setVisibility(8);
                rq0 rq0Var = uq0Var.L;
                rq0Var.f28029f = null;
                rq0Var.l();
                uq0Var.B0 = null;
                uq0Var.M0 = false;
                return;
            default:
                uq0 uq0Var2 = ((bq0) this.f24718b).d;
                uq0Var2.F.setVisibility(8);
                uq0Var2.G.setVisibility(8);
                uq0Var2.f28905y0.setVisibility(8);
                uq0Var2.B0 = null;
                return;
        }
    }
}
