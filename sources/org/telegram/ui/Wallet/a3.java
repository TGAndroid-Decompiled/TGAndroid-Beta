package org.telegram.ui.Wallet;
public final class a3 implements o1.g {
    public final int f33981a;
    public final Object f33982b;

    public a3(Object obj, int i10) {
        this.f33981a = i10;
        this.f33982b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33981a) {
            case 0:
                g3 g3Var = (g3) this.f33982b;
                g3Var.G = f7;
                g3Var.c();
                return;
            case 1:
                i8 i8Var = (i8) this.f33982b;
                i8Var.e = f7;
                i8Var.setScaleX(f7);
                i8Var.setScaleY(f7);
                return;
            case 2:
                i9 i9Var = (i9) this.f33982b;
                i9Var.Y = f7;
                i9Var.A0();
                return;
            default:
                ((h9) this.f33982b).f34288c.setConversionWobble(f7);
                return;
        }
    }
}
