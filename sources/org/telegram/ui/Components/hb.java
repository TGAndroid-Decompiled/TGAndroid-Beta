package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f26836a;
    public final Object f26837b;

    public hb(Object obj, int i10) {
        this.f26836a = i10;
        this.f26837b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26836a) {
            case 0:
                qc qcVar = (qc) this.f26837b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f26837b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f26837b;
                alVar.f24606i0 = null;
                alVar.f24607j0 = 1.0f;
                alVar.k0();
                return;
            case 3:
                rp0 rp0Var = (rp0) this.f26837b;
                rp0Var.f30011q = false;
                rp0Var.dismiss();
                return;
            case 4:
                sp0 sp0Var = (sp0) this.f26837b;
                sp0Var.f30302s = false;
                sp0Var.f30301r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == sp0Var.f30299f) {
                    sp0Var.f30299f = null;
                    return;
                }
                return;
            case 5:
                er0 er0Var = (er0) this.f26837b;
                er0Var.F.setVisibility(8);
                er0Var.A0.setVisibility(8);
                br0 br0Var = er0Var.M;
                br0Var.f25011f = null;
                br0Var.l();
                er0Var.C0 = null;
                er0Var.N0 = false;
                return;
            default:
                er0 er0Var2 = ((kq0) this.f26837b).d;
                er0Var2.G.setVisibility(8);
                er0Var2.H.setVisibility(8);
                er0Var2.f26009z0.setVisibility(8);
                er0Var2.C0 = null;
                return;
        }
    }
}
