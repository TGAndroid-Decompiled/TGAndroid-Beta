package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f24784a;
    public final Object f24785b;

    public hb(Object obj, int i10) {
        this.f24784a = i10;
        this.f24785b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24784a) {
            case 0:
                qc qcVar = (qc) this.f24785b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f24785b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                kp0 kp0Var = (kp0) this.f24785b;
                kp0Var.f25813q = false;
                kp0Var.dismiss();
                return;
            case 3:
                lp0 lp0Var = (lp0) this.f24785b;
                lp0Var.f26116s = false;
                lp0Var.f26115r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == lp0Var.f26113f) {
                    lp0Var.f26113f = null;
                    return;
                }
                return;
            case 4:
                vq0 vq0Var = (vq0) this.f24785b;
                vq0Var.E.setVisibility(8);
                vq0Var.f29773z0.setVisibility(8);
                sq0 sq0Var = vq0Var.L;
                sq0Var.f28358f = null;
                sq0Var.l();
                vq0Var.B0 = null;
                vq0Var.M0 = false;
                return;
            default:
                vq0 vq0Var2 = ((cq0) this.f24785b).d;
                vq0Var2.F.setVisibility(8);
                vq0Var2.G.setVisibility(8);
                vq0Var2.f29772y0.setVisibility(8);
                vq0Var2.B0 = null;
                return;
        }
    }
}
