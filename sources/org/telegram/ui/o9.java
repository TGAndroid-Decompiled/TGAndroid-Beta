package org.telegram.ui;
public final class o9 implements o1.f {
    public final int f36227a;
    public final Object f36228b;

    public o9(Object obj, int i10) {
        this.f36227a = i10;
        this.f36228b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f36227a) {
            case 0:
                v9 v9Var = (v9) this.f36228b;
                o1.k kVar = v9Var.f38471x;
                if (kVar != null) {
                    kVar.c();
                    v9Var.f38471x = null;
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) this.f36228b;
                if (hVar == to0Var.f37861c) {
                    to0Var.f37861c = null;
                    return;
                }
                return;
            default:
                ((ou0) this.f36228b).D();
                return;
        }
    }
}
