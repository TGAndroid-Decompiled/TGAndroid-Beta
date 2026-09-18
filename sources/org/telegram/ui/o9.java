package org.telegram.ui;
public final class o9 implements o1.f {
    public final int f36129a;
    public final Object f36130b;

    public o9(Object obj, int i10) {
        this.f36129a = i10;
        this.f36130b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f36129a) {
            case 0:
                v9 v9Var = (v9) this.f36130b;
                o1.k kVar = v9Var.f38380x;
                if (kVar != null) {
                    kVar.c();
                    v9Var.f38380x = null;
                    return;
                }
                return;
            case 1:
                to0 to0Var = (to0) this.f36130b;
                if (hVar == to0Var.f37786c) {
                    to0Var.f37786c = null;
                    return;
                }
                return;
            default:
                ((ou0) this.f36130b).D();
                return;
        }
    }
}
