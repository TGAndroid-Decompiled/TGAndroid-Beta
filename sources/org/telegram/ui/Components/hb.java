package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f26843a;
    public final Object f26844b;

    public hb(Object obj, int i10) {
        this.f26843a = i10;
        this.f26844b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26843a) {
            case 0:
                qc qcVar = (qc) this.f26844b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f26844b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f26844b;
                alVar.f24626i0 = null;
                alVar.f24627j0 = 1.0f;
                alVar.k0();
                return;
            case 3:
                rp0 rp0Var = (rp0) this.f26844b;
                rp0Var.f30007q = false;
                rp0Var.dismiss();
                return;
            case 4:
                sp0 sp0Var = (sp0) this.f26844b;
                sp0Var.f30310s = false;
                sp0Var.f30309r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == sp0Var.f30307f) {
                    sp0Var.f30307f = null;
                    return;
                }
                return;
            case 5:
                dr0 dr0Var = (dr0) this.f26844b;
                dr0Var.E.setVisibility(8);
                dr0Var.f25685z0.setVisibility(8);
                ar0 ar0Var = dr0Var.L;
                ar0Var.f24700f = null;
                ar0Var.l();
                dr0Var.B0 = null;
                dr0Var.M0 = false;
                return;
            default:
                dr0 dr0Var2 = ((kq0) this.f26844b).d;
                dr0Var2.F.setVisibility(8);
                dr0Var2.G.setVisibility(8);
                dr0Var2.f25684y0.setVisibility(8);
                dr0Var2.B0 = null;
                return;
        }
    }
}
