package org.telegram.ui.Wallet;
public final class r2 implements o1.g {
    public final int f35445a;
    public final Object f35446b;

    public r2(Object obj, int i10) {
        this.f35445a = i10;
        this.f35446b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35445a) {
            case 0:
                x2 x2Var = (x2) this.f35446b;
                x2Var.G = f7;
                x2Var.c();
                return;
            case 1:
                j8 j8Var = (j8) this.f35446b;
                j8Var.Y = f7;
                j8Var.A0();
                return;
            default:
                ((i8) this.f35446b).f35048c.setConversionWobble(f7);
                return;
        }
    }
}
