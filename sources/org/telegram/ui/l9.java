package org.telegram.ui;
public final class l9 implements r1.c {
    public final int f47549a;
    public final Object f47550b;

    public l9(Object obj, int i7) {
        this.f47549a = i7;
        this.f47550b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f47549a) {
            case 0:
                s9 s9Var = (s9) this.f47550b;
                r1.g gVar2 = s9Var.D;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.D = null;
                    return;
                }
                return;
            case 1:
                gl0 gl0Var = (gl0) this.f47550b;
                if (gVar == gl0Var.f46114c) {
                    gl0Var.f46114c = null;
                    return;
                }
                return;
            default:
                ((lq0) this.f47550b).E();
                return;
        }
    }
}
