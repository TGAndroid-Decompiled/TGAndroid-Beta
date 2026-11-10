package org.telegram.ui.Wallet;
public final class s6 implements r1.c {
    public final int f43158a;
    public final Object f43159b;

    public s6(Object obj, int i7) {
        this.f43158a = i7;
        this.f43159b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f43158a) {
            case 0:
                x6.b((x6) this.f43159b, z9, f10);
                return;
            default:
                o9 o9Var = (o9) this.f43159b;
                o9Var.f42916a0 = null;
                o9Var.f42917b0 = 1.0f;
                o9Var.G0();
                return;
        }
    }
}
