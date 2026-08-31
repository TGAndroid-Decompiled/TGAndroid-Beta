package org.telegram.ui;
public final class o9 implements o1.f {
    public final int f39660a;
    public final Object f39661b;

    public o9(Object obj, int i10) {
        this.f39660a = i10;
        this.f39661b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f39660a) {
            case 0:
                v9 v9Var = (v9) this.f39661b;
                o1.j jVar = v9Var.f42178x;
                if (jVar != null) {
                    jVar.c();
                    v9Var.f42178x = null;
                    return;
                }
                return;
            case 1:
                ho0 ho0Var = (ho0) this.f39661b;
                if (hVar == ho0Var.f37556c) {
                    ho0Var.f37556c = null;
                    return;
                }
                return;
            default:
                ((vt0) this.f39661b).D();
                return;
        }
    }
}
