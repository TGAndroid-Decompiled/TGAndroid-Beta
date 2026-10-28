package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f28938a;
    public final Object f28939b;

    public hb(Object obj, int i10) {
        this.f28938a = i10;
        this.f28939b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28938a) {
            case 0:
                qc qcVar = (qc) this.f28939b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f28939b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f28939b;
                alVar.f26587l0 = null;
                alVar.m0 = 1.0f;
                alVar.k0();
                return;
            case 3:
                cq0 cq0Var = (cq0) this.f28939b;
                cq0Var.f27228q = false;
                cq0Var.dismiss();
                return;
            case 4:
                dq0 dq0Var = (dq0) this.f28939b;
                dq0Var.f27528s = false;
                dq0Var.f27527r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == dq0Var.f27525f) {
                    dq0Var.f27525f = null;
                    return;
                }
                return;
            case 5:
                nr0 nr0Var = (nr0) this.f28939b;
                nr0Var.F.setVisibility(8);
                nr0Var.A0.setVisibility(8);
                kr0 kr0Var = nr0Var.M;
                kr0Var.f30018f = null;
                kr0Var.l();
                nr0Var.C0 = null;
                nr0Var.N0 = false;
                return;
            default:
                nr0 nr0Var2 = ((uq0) this.f28939b).d;
                nr0Var2.G.setVisibility(8);
                nr0Var2.H.setVisibility(8);
                nr0Var2.f31063z0.setVisibility(8);
                nr0Var2.C0 = null;
                return;
        }
    }
}
