package org.telegram.ui.Wallet;
public final class r6 implements r1.c {
    public final int f44442a;
    public final Object f44443b;

    public r6(Object obj, int i7) {
        this.f44442a = i7;
        this.f44443b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f44442a) {
            case 0:
                w6.b((w6) this.f44443b, z10, f10);
                return;
            default:
                p9 p9Var = (p9) this.f44443b;
                p9Var.f44334b0 = null;
                p9Var.f44335c0 = 1.0f;
                p9Var.G0();
                return;
        }
    }
}
