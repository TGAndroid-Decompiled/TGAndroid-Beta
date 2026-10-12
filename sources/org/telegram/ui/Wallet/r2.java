package org.telegram.ui.Wallet;
public final class r2 implements o1.g {
    public final int f33647a;
    public final Object f33648b;

    public r2(Object obj, int i10) {
        this.f33647a = i10;
        this.f33648b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33647a) {
            case 0:
                x2 x2Var = (x2) this.f33648b;
                x2Var.G = f7;
                x2Var.c();
                return;
            case 1:
                i8 i8Var = (i8) this.f33648b;
                i8Var.Y = f7;
                i8Var.A0();
                return;
            default:
                ((h8) this.f33648b).f33252c.setConversionWobble(f7);
                return;
        }
    }
}
