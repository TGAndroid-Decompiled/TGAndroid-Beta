package org.telegram.ui;
public final class l9 implements r1.c {
    public final int f47472a;
    public final Object f47473b;

    public l9(Object obj, int i7) {
        this.f47472a = i7;
        this.f47473b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f47472a) {
            case 0:
                s9 s9Var = (s9) this.f47473b;
                r1.g gVar2 = s9Var.D;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.D = null;
                    return;
                }
                return;
            case 1:
                dl0 dl0Var = (dl0) this.f47473b;
                if (gVar == dl0Var.f45088c) {
                    dl0Var.f45088c = null;
                    return;
                }
                return;
            default:
                ((iq0) this.f47473b).E();
                return;
        }
    }
}
