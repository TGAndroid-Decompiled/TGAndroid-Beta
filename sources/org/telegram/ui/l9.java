package org.telegram.ui;
public final class l9 implements r1.c {
    public final int f47448a;
    public final Object f47449b;

    public l9(Object obj, int i7) {
        this.f47448a = i7;
        this.f47449b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f47448a) {
            case 0:
                s9 s9Var = (s9) this.f47449b;
                r1.g gVar2 = s9Var.D;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.D = null;
                    return;
                }
                return;
            case 1:
                dl0 dl0Var = (dl0) this.f47449b;
                if (gVar == dl0Var.f45069c) {
                    dl0Var.f45069c = null;
                    return;
                }
                return;
            default:
                ((hq0) this.f47449b).E();
                return;
        }
    }
}
