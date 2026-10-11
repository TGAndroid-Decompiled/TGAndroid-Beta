package org.telegram.ui;
public final class l9 implements o1.f {
    public final int f39578a;
    public final Object f39579b;

    public l9(Object obj, int i10) {
        this.f39578a = i10;
        this.f39579b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39578a) {
            case 0:
                u9 u9Var = (u9) this.f39579b;
                o1.k kVar = u9Var.f42462y;
                if (kVar != null) {
                    kVar.c();
                    u9Var.f42462y = null;
                    return;
                }
                return;
            case 1:
                qo0 qo0Var = (qo0) this.f39579b;
                if (hVar == qo0Var.f41247c) {
                    qo0Var.f41247c = null;
                    return;
                }
                return;
            default:
                ((ou0) this.f39579b).D();
                return;
        }
    }
}
