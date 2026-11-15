package org.telegram.ui;
public final class l9 implements r1.c {
    public final int f48902a;
    public final Object f48903b;

    public l9(Object obj, int i7) {
        this.f48902a = i7;
        this.f48903b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f48902a) {
            case 0:
                t9 t9Var = (t9) this.f48903b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    return;
                }
                return;
            case 1:
                gl0 gl0Var = (gl0) this.f48903b;
                if (gVar == gl0Var.f47465c) {
                    gl0Var.f47465c = null;
                    return;
                }
                return;
            default:
                ((hq0) this.f48903b).E();
                return;
        }
    }
}
