package org.telegram.ui;
public final class p9 implements o1.f {
    public final int f39370a;
    public final Object f39371b;

    public p9(Object obj, int i10) {
        this.f39370a = i10;
        this.f39371b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39370a) {
            case 0:
                w9 w9Var = (w9) this.f39371b;
                o1.k kVar = w9Var.f41974x;
                if (kVar != null) {
                    kVar.c();
                    w9Var.f41974x = null;
                    return;
                }
                return;
            case 1:
                oo0 oo0Var = (oo0) this.f39371b;
                if (hVar == oo0Var.f39252c) {
                    oo0Var.f39252c = null;
                    return;
                }
                return;
            default:
                ((ju0) this.f39371b).E();
                return;
        }
    }
}
