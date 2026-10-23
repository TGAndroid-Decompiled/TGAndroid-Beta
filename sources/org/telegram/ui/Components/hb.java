package org.telegram.ui.Components;
public final class hb implements o1.f {
    public final int f26877a;
    public final Object f26878b;

    public hb(Object obj, int i10) {
        this.f26877a = i10;
        this.f26878b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26877a) {
            case 0:
                qc qcVar = (qc) this.f26878b;
                if (qcVar.d == hVar) {
                    qcVar.d = null;
                    return;
                }
                return;
            case 1:
                db dbVar = (db) this.f26878b;
                if (!z10) {
                    dbVar.run();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f26878b;
                alVar.f24750l0 = null;
                alVar.m0 = 1.0f;
                alVar.k0();
                return;
            case 3:
                wp0 wp0Var = (wp0) this.f26878b;
                wp0Var.f32305q = false;
                wp0Var.dismiss();
                return;
            case 4:
                xp0 xp0Var = (xp0) this.f26878b;
                xp0Var.f32628s = false;
                xp0Var.f32627r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xp0Var.f32625f) {
                    xp0Var.f32625f = null;
                    return;
                }
                return;
            case 5:
                ir0 ir0Var = (ir0) this.f26878b;
                ir0Var.F.setVisibility(8);
                ir0Var.A0.setVisibility(8);
                fr0 fr0Var = ir0Var.M;
                fr0Var.f26442f = null;
                fr0Var.l();
                ir0Var.C0 = null;
                ir0Var.N0 = false;
                return;
            default:
                ir0 ir0Var2 = ((pq0) this.f26878b).d;
                ir0Var2.G.setVisibility(8);
                ir0Var2.H.setVisibility(8);
                ir0Var2.f27442z0.setVisibility(8);
                ir0Var2.C0 = null;
                return;
        }
    }
}
