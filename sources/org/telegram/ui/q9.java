package org.telegram.ui;
public final class q9 implements o1.f {
    public final int f39359a;
    public final Object f39360b;

    public q9(Object obj, int i10) {
        this.f39359a = i10;
        this.f39360b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f39359a) {
            case 0:
                z9 z9Var = (z9) this.f39360b;
                o1.k kVar = z9Var.f42563y;
                if (kVar != null) {
                    kVar.c();
                    z9Var.f42563y = null;
                    return;
                }
                return;
            case 1:
                yo0 yo0Var = (yo0) this.f39360b;
                if (hVar == yo0Var.f42201c) {
                    yo0Var.f42201c = null;
                    return;
                }
                return;
            default:
                ((vu0) this.f39360b).D();
                return;
        }
    }
}
