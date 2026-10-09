package org.telegram.ui;
public final class m9 implements o1.f {
    public final int f39790a;
    public final Object f39791b;

    public m9(Object obj, int i10) {
        this.f39790a = i10;
        this.f39791b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39790a) {
            case 0:
                v9 v9Var = (v9) this.f39791b;
                o1.k kVar = v9Var.f42728y;
                if (kVar != null) {
                    kVar.c();
                    v9Var.f42728y = null;
                    return;
                }
                return;
            case 1:
                ro0 ro0Var = (ro0) this.f39791b;
                if (hVar == ro0Var.f41467c) {
                    ro0Var.f41467c = null;
                    return;
                }
                return;
            default:
                ((pu0) this.f39791b).D();
                return;
        }
    }
}
