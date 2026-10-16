package org.telegram.ui;
public final class q9 implements o1.f {
    public final int f39080a;
    public final Object f39081b;

    public q9(Object obj, int i10) {
        this.f39080a = i10;
        this.f39081b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39080a) {
            case 0:
                z9 z9Var = (z9) this.f39081b;
                o1.k kVar = z9Var.f42237y;
                if (kVar != null) {
                    kVar.c();
                    z9Var.f42237y = null;
                    return;
                }
                return;
            case 1:
                wo0 wo0Var = (wo0) this.f39081b;
                if (hVar == wo0Var.f41333c) {
                    wo0Var.f41333c = null;
                    return;
                }
                return;
            default:
                ((uu0) this.f39081b).D();
                return;
        }
    }
}
