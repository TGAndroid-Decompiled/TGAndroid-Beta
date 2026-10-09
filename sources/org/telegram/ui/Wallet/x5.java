package org.telegram.ui.Wallet;
public final class x5 implements o1.f {
    public final int f35665a;
    public final Object f35666b;

    public x5(Object obj, int i10) {
        this.f35665a = i10;
        this.f35666b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f35665a) {
            case 0:
                c6.b((c6) this.f35666b, z10, f7);
                return;
            default:
                j8 j8Var = (j8) this.f35666b;
                j8Var.X = null;
                j8Var.Y = 1.0f;
                j8Var.A0();
                return;
        }
    }
}
