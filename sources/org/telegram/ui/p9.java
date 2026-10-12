package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f40876a;
    public final Object f40877b;

    public p9(Object obj, int i10) {
        this.f40876a = i10;
        this.f40877b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f40876a) {
            case 0:
                y9 y9Var = (y9) this.f40877b;
                o1.k kVar = y9Var.f44348y;
                if (kVar != null) {
                    kVar.c();
                    y9Var.f44348y = null;
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) this.f40877b;
                if (hVar == to0Var.f42261c) {
                    to0Var.f42261c = null;
                    return;
                }
                return;
            default:
                ((ru0) this.f40877b).D();
                return;
        }
    }
}
