package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f26851a;
    public final Object f26852b;

    public hb(Object obj, int i10) {
        this.f26851a = i10;
        this.f26852b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26851a) {
            case 0:
                qc qcVar = (qc) this.f26852b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f26852b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f26852b;
                alVar.f24648i0 = null;
                alVar.f24649j0 = 1.0f;
                alVar.k0();
                return;
            case 3:
                sp0 sp0Var = (sp0) this.f26852b;
                sp0Var.f30335q = false;
                sp0Var.dismiss();
                return;
            case 4:
                tp0 tp0Var = (tp0) this.f26852b;
                tp0Var.f30652s = false;
                tp0Var.f30651r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == tp0Var.f30649f) {
                    tp0Var.f30649f = null;
                    return;
                }
                return;
            case 5:
                fr0 fr0Var = (fr0) this.f26852b;
                fr0Var.F.setVisibility(8);
                fr0Var.A0.setVisibility(8);
                cr0 cr0Var = fr0Var.M;
                cr0Var.f25252f = null;
                cr0Var.l();
                fr0Var.C0 = null;
                fr0Var.N0 = false;
                return;
            default:
                fr0 fr0Var2 = ((lq0) this.f26852b).d;
                fr0Var2.G.setVisibility(8);
                fr0Var2.H.setVisibility(8);
                fr0Var2.f26401z0.setVisibility(8);
                fr0Var2.C0 = null;
                return;
        }
    }
}
