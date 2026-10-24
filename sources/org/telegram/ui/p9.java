package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f40392a;
    public final Object f40393b;

    public p9(Object obj, int i10) {
        this.f40392a = i10;
        this.f40393b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f40392a) {
            case 0:
                w9 w9Var = (w9) this.f40393b;
                o1.k kVar = w9Var.f42963y;
                if (kVar != null) {
                    kVar.c();
                    w9Var.f42963y = null;
                    return;
                }
                return;
            case 1:
                do0 do0Var = (do0) this.f40393b;
                if (hVar == do0Var.f36656c) {
                    do0Var.f36656c = null;
                    return;
                }
                return;
            default:
                ((wt0) this.f40393b).E();
                return;
        }
    }
}
