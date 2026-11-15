package org.telegram.ui;
public final class l9 implements r1.c {
    public final int f48906a;
    public final Object f48907b;

    public l9(Object obj, int i7) {
        this.f48906a = i7;
        this.f48907b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f48906a) {
            case 0:
                t9 t9Var = (t9) this.f48907b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    return;
                }
                return;
            case 1:
                fl0 fl0Var = (fl0) this.f48907b;
                if (gVar == fl0Var.f47157c) {
                    fl0Var.f47157c = null;
                    return;
                }
                return;
            default:
                ((hq0) this.f48907b).E();
                return;
        }
    }
}
