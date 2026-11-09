package org.telegram.ui;
public final class l9 implements r1.c {
    public final int f47532a;
    public final Object f47533b;

    public l9(Object obj, int i7) {
        this.f47532a = i7;
        this.f47533b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f47532a) {
            case 0:
                s9 s9Var = (s9) this.f47533b;
                r1.g gVar2 = s9Var.D;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.D = null;
                    return;
                }
                return;
            case 1:
                fl0 fl0Var = (fl0) this.f47533b;
                if (gVar == fl0Var.f45742c) {
                    fl0Var.f45742c = null;
                    return;
                }
                return;
            default:
                ((kq0) this.f47533b).E();
                return;
        }
    }
}
