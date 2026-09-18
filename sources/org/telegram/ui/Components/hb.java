package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f24627a;
    public final Object f24628b;

    public hb(Object obj, int i10) {
        this.f24627a = i10;
        this.f24628b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24627a) {
            case 0:
                qc qcVar = (qc) this.f24628b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f24628b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                jp0 jp0Var = (jp0) this.f24628b;
                jp0Var.f25405q = false;
                jp0Var.dismiss();
                return;
            case 3:
                kp0 kp0Var = (kp0) this.f24628b;
                kp0Var.f25775s = false;
                kp0Var.f25774r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == kp0Var.f25772f) {
                    kp0Var.f25772f = null;
                    return;
                }
                return;
            case 4:
                vq0 vq0Var = (vq0) this.f24628b;
                vq0Var.E.setVisibility(8);
                vq0Var.f29745z0.setVisibility(8);
                sq0 sq0Var = vq0Var.L;
                sq0Var.f28221f = null;
                sq0Var.l();
                vq0Var.B0 = null;
                vq0Var.M0 = false;
                return;
            default:
                vq0 vq0Var2 = ((cq0) this.f24628b).d;
                vq0Var2.F.setVisibility(8);
                vq0Var2.G.setVisibility(8);
                vq0Var2.f29744y0.setVisibility(8);
                vq0Var2.B0 = null;
                return;
        }
    }
}
