package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f28902a;
    public final Object f28903b;

    public hb(Object obj, int i10) {
        this.f28902a = i10;
        this.f28903b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f28902a) {
            case 0:
                qc qcVar = (qc) this.f28903b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f28903b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f28903b;
                alVar.f26530l0 = null;
                alVar.m0 = 1.0f;
                alVar.k0();
                return;
            case 3:
                bq0 bq0Var = (bq0) this.f28903b;
                bq0Var.f26940q = false;
                bq0Var.dismiss();
                return;
            case 4:
                cq0 cq0Var = (cq0) this.f28903b;
                cq0Var.f27241s = false;
                cq0Var.f27240r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == cq0Var.f27238f) {
                    cq0Var.f27238f = null;
                    return;
                }
                return;
            case 5:
                mr0 mr0Var = (mr0) this.f28903b;
                mr0Var.F.setVisibility(8);
                mr0Var.A0.setVisibility(8);
                jr0 jr0Var = mr0Var.M;
                jr0Var.f29709f = null;
                jr0Var.l();
                mr0Var.C0 = null;
                mr0Var.N0 = false;
                return;
            default:
                mr0 mr0Var2 = ((tq0) this.f28903b).d;
                mr0Var2.G.setVisibility(8);
                mr0Var2.H.setVisibility(8);
                mr0Var2.f30730z0.setVisibility(8);
                mr0Var2.C0 = null;
                return;
        }
    }
}
