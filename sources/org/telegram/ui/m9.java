package org.telegram.ui;
public final class m9 implements o1.f {
    public final int f39834a;
    public final Object f39835b;

    public m9(Object obj, int i10) {
        this.f39834a = i10;
        this.f39835b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39834a) {
            case 0:
                v9 v9Var = (v9) this.f39835b;
                o1.k kVar = v9Var.f42772y;
                if (kVar != null) {
                    kVar.c();
                    v9Var.f42772y = null;
                    return;
                }
                return;
            case 1:
                ro0 ro0Var = (ro0) this.f39835b;
                if (hVar == ro0Var.f41511c) {
                    ro0Var.f41511c = null;
                    return;
                }
                return;
            default:
                ((pu0) this.f39835b).D();
                return;
        }
    }
}
