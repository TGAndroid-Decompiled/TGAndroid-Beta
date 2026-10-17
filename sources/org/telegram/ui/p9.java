package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f40019a;
    public final Object f40020b;

    public p9(Object obj, int i10) {
        this.f40019a = i10;
        this.f40020b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f40019a) {
            case 0:
                y9 y9Var = (y9) this.f40020b;
                o1.k kVar = y9Var.E;
                if (kVar != null) {
                    kVar.c();
                    y9Var.E = null;
                    return;
                }
                return;
            case 1:
                bo0 bo0Var = (bo0) this.f40020b;
                if (hVar == bo0Var.f35718c) {
                    bo0Var.f35718c = null;
                    return;
                }
                return;
            default:
                ((wt0) this.f40020b).D();
                return;
        }
    }
}
