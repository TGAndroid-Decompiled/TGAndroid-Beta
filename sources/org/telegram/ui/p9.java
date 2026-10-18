package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f40038a;
    public final Object f40039b;

    public p9(Object obj, int i10) {
        this.f40038a = i10;
        this.f40039b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f40038a) {
            case 0:
                y9 y9Var = (y9) this.f40039b;
                o1.k kVar = y9Var.E;
                if (kVar != null) {
                    kVar.c();
                    y9Var.E = null;
                    return;
                }
                return;
            case 1:
                co0 co0Var = (co0) this.f40039b;
                if (hVar == co0Var.f35982c) {
                    co0Var.f35982c = null;
                    return;
                }
                return;
            default:
                ((wt0) this.f40039b).D();
                return;
        }
    }
}
