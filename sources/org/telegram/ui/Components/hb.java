package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f26726a;
    public final Object f26727b;

    public hb(Object obj, int i10) {
        this.f26726a = i10;
        this.f26727b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26726a) {
            case 0:
                qc qcVar = (qc) this.f26727b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f26727b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                vo0 vo0Var = (vo0) this.f26727b;
                vo0Var.f31409q = false;
                vo0Var.dismiss();
                return;
            case 3:
                xo0 xo0Var = (xo0) this.f26727b;
                xo0Var.f32669s = false;
                xo0Var.f32668r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xo0Var.f32666f) {
                    xo0Var.f32666f = null;
                    return;
                }
                return;
            case 4:
                hq0 hq0Var = (hq0) this.f26727b;
                hq0Var.E.setVisibility(8);
                hq0Var.f26848z0.setVisibility(8);
                eq0 eq0Var = hq0Var.L;
                eq0Var.f25781f = null;
                eq0Var.l();
                hq0Var.B0 = null;
                hq0Var.M0 = false;
                return;
            default:
                hq0 hq0Var2 = ((op0) this.f26727b).d;
                hq0Var2.F.setVisibility(8);
                hq0Var2.G.setVisibility(8);
                hq0Var2.f26847y0.setVisibility(8);
                hq0Var2.B0 = null;
                return;
        }
    }
}
