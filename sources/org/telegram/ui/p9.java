package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f40116a;
    public final Object f40117b;

    public p9(Object obj, int i10) {
        this.f40116a = i10;
        this.f40117b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f40116a) {
            case 0:
                w9 w9Var = (w9) this.f40117b;
                o1.k kVar = w9Var.f42510y;
                if (kVar != null) {
                    kVar.c();
                    w9Var.f42510y = null;
                    return;
                }
                return;
            case 1:
                ao0 ao0Var = (ao0) this.f40117b;
                if (hVar == ao0Var.f35393c) {
                    ao0Var.f35393c = null;
                    return;
                }
                return;
            default:
                ((ut0) this.f40117b).D();
                return;
        }
    }
}
