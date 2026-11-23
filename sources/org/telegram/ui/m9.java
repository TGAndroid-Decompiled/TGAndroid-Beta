package org.telegram.ui;
public final class m9 implements r1.c {
    public final int f49794a;
    public final Object f49795b;

    public m9(Object obj, int i7) {
        this.f49794a = i7;
        this.f49795b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f49794a) {
            case 0:
                t9 t9Var = (t9) this.f49795b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    return;
                }
                return;
            case 1:
                il0 il0Var = (il0) this.f49795b;
                if (gVar == il0Var.f48760c) {
                    il0Var.f48760c = null;
                    return;
                }
                return;
            default:
                ((kq0) this.f49795b).E();
                return;
        }
    }
}
