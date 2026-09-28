package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f24757a;
    public final Object f24758b;

    public hb(Object obj, int i10) {
        this.f24757a = i10;
        this.f24758b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24757a) {
            case 0:
                qc qcVar = (qc) this.f24758b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f24758b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                kp0 kp0Var = (kp0) this.f24758b;
                kp0Var.f25784q = false;
                kp0Var.dismiss();
                return;
            case 3:
                lp0 lp0Var = (lp0) this.f24758b;
                lp0Var.f26065s = false;
                lp0Var.f26064r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == lp0Var.f26062f) {
                    lp0Var.f26062f = null;
                    return;
                }
                return;
            case 4:
                wq0 wq0Var = (wq0) this.f24758b;
                wq0Var.E.setVisibility(8);
                wq0Var.f30160z0.setVisibility(8);
                tq0 tq0Var = wq0Var.L;
                tq0Var.f28611f = null;
                tq0Var.l();
                wq0Var.B0 = null;
                wq0Var.M0 = false;
                return;
            default:
                wq0 wq0Var2 = ((dq0) this.f24758b).d;
                wq0Var2.F.setVisibility(8);
                wq0Var2.G.setVisibility(8);
                wq0Var2.f30159y0.setVisibility(8);
                wq0Var2.B0 = null;
                return;
        }
    }
}
