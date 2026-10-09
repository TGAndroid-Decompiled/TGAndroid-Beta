package org.telegram.ui.Wallet;
public final class r2 implements o1.g {
    public final int f35411a;
    public final Object f35412b;

    public r2(Object obj, int i10) {
        this.f35411a = i10;
        this.f35412b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35411a) {
            case 0:
                x2 x2Var = (x2) this.f35412b;
                x2Var.G = f7;
                x2Var.c();
                return;
            case 1:
                i8 i8Var = (i8) this.f35412b;
                i8Var.Y = f7;
                i8Var.A0();
                return;
            default:
                ((h8) this.f35412b).f34985c.setConversionWobble(f7);
                return;
        }
    }
}
