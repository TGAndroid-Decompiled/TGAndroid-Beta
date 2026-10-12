package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f40874a;
    public final Object f40875b;

    public p9(Object obj, int i10) {
        this.f40874a = i10;
        this.f40875b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f40874a) {
            case 0:
                y9 y9Var = (y9) this.f40875b;
                o1.k kVar = y9Var.f44343y;
                if (kVar != null) {
                    kVar.c();
                    y9Var.f44343y = null;
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) this.f40875b;
                if (hVar == to0Var.f42259c) {
                    to0Var.f42259c = null;
                    return;
                }
                return;
            default:
                ((ru0) this.f40875b).D();
                return;
        }
    }
}
