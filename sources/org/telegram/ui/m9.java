package org.telegram.ui;
public final class m9 implements r1.c {
    public final int f49821a;
    public final Object f49822b;

    public m9(Object obj, int i7) {
        this.f49821a = i7;
        this.f49822b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f49821a) {
            case 0:
                t9 t9Var = (t9) this.f49822b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    return;
                }
                return;
            case 1:
                il0 il0Var = (il0) this.f49822b;
                if (gVar == il0Var.f48778c) {
                    il0Var.f48778c = null;
                    return;
                }
                return;
            default:
                ((jq0) this.f49822b).E();
                return;
        }
    }
}
