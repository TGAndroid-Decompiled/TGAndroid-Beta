package org.telegram.ui.Wallet;
public final class x5 implements o1.f {
    public final int f33586a;
    public final Object f33587b;

    public x5(Object obj, int i10) {
        this.f33586a = i10;
        this.f33587b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f33586a) {
            case 0:
                c6.b((c6) this.f33587b, z10, f7);
                return;
            default:
                j8 j8Var = (j8) this.f33587b;
                j8Var.X = null;
                j8Var.Y = 1.0f;
                j8Var.A0();
                return;
        }
    }
}
