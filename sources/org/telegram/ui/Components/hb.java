package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f24626a;
    public final Object f24627b;

    public hb(Object obj, int i10) {
        this.f24626a = i10;
        this.f24627b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24626a) {
            case 0:
                qc qcVar = (qc) this.f24627b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f24627b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                vo0 vo0Var = (vo0) this.f24627b;
                vo0Var.f28823q = false;
                vo0Var.dismiss();
                return;
            case 3:
                wo0 wo0Var = (wo0) this.f24627b;
                wo0Var.f29771s = false;
                wo0Var.f29770r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == wo0Var.f29768f) {
                    wo0Var.f29768f = null;
                    return;
                }
                return;
            case 4:
                hq0 hq0Var = (hq0) this.f24627b;
                hq0Var.E.setVisibility(8);
                hq0Var.f24806z0.setVisibility(8);
                eq0 eq0Var = hq0Var.L;
                eq0Var.f23737f = null;
                eq0Var.l();
                hq0Var.B0 = null;
                hq0Var.M0 = false;
                return;
            default:
                hq0 hq0Var2 = ((op0) this.f24627b).d;
                hq0Var2.F.setVisibility(8);
                hq0Var2.G.setVisibility(8);
                hq0Var2.f24805y0.setVisibility(8);
                hq0Var2.B0 = null;
                return;
        }
    }
}
