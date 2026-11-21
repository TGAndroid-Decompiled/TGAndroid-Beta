package org.telegram.ui;
public final class m9 implements r1.c {
    public final int f49817a;
    public final Object f49818b;

    public m9(Object obj, int i7) {
        this.f49817a = i7;
        this.f49818b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f49817a) {
            case 0:
                t9 t9Var = (t9) this.f49818b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    return;
                }
                return;
            case 1:
                il0 il0Var = (il0) this.f49818b;
                if (gVar == il0Var.f48774c) {
                    il0Var.f48774c = null;
                    return;
                }
                return;
            default:
                ((jq0) this.f49818b).E();
                return;
        }
    }
}
