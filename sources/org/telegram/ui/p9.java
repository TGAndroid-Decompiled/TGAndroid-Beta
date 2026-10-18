package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f39999a;
    public final Object f40000b;

    public p9(Object obj, int i10) {
        this.f39999a = i10;
        this.f40000b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39999a) {
            case 0:
                y9 y9Var = (y9) this.f40000b;
                o1.k kVar = y9Var.E;
                if (kVar != null) {
                    kVar.c();
                    y9Var.E = null;
                    return;
                }
                return;
            case 1:
                co0 co0Var = (co0) this.f40000b;
                if (hVar == co0Var.f35954c) {
                    co0Var.f35954c = null;
                    return;
                }
                return;
            default:
                ((wt0) this.f40000b).D();
                return;
        }
    }
}
