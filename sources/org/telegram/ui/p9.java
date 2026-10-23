package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f40399a;
    public final Object f40400b;

    public p9(Object obj, int i10) {
        this.f40399a = i10;
        this.f40400b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f40399a) {
            case 0:
                w9 w9Var = (w9) this.f40400b;
                o1.k kVar = w9Var.f42977y;
                if (kVar != null) {
                    kVar.c();
                    w9Var.f42977y = null;
                    return;
                }
                return;
            case 1:
                eo0 eo0Var = (eo0) this.f40400b;
                if (hVar == eo0Var.f37006c) {
                    eo0Var.f37006c = null;
                    return;
                }
                return;
            default:
                ((xt0) this.f40400b).E();
                return;
        }
    }
}
