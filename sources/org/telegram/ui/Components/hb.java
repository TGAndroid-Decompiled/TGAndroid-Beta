package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f26850a;
    public final Object f26851b;

    public hb(Object obj, int i10) {
        this.f26850a = i10;
        this.f26851b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26850a) {
            case 0:
                qc qcVar = (qc) this.f26851b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f26851b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f26851b;
                alVar.f24633i0 = null;
                alVar.f24634j0 = 1.0f;
                alVar.k0();
                return;
            case 3:
                rp0 rp0Var = (rp0) this.f26851b;
                rp0Var.f30013q = false;
                rp0Var.dismiss();
                return;
            case 4:
                sp0 sp0Var = (sp0) this.f26851b;
                sp0Var.f30317s = false;
                sp0Var.f30316r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == sp0Var.f30314f) {
                    sp0Var.f30314f = null;
                    return;
                }
                return;
            case 5:
                dr0 dr0Var = (dr0) this.f26851b;
                dr0Var.E.setVisibility(8);
                dr0Var.f25692z0.setVisibility(8);
                ar0 ar0Var = dr0Var.L;
                ar0Var.f24707f = null;
                ar0Var.l();
                dr0Var.B0 = null;
                dr0Var.M0 = false;
                return;
            default:
                dr0 dr0Var2 = ((kq0) this.f26851b).d;
                dr0Var2.F.setVisibility(8);
                dr0Var2.G.setVisibility(8);
                dr0Var2.f25691y0.setVisibility(8);
                dr0Var2.B0 = null;
                return;
        }
    }
}
