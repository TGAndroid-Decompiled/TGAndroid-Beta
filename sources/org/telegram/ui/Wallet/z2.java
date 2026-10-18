package org.telegram.ui.Wallet;
public final class z2 implements o1.g {
    public final int f35167a;
    public final Object f35168b;

    public z2(Object obj, int i10) {
        this.f35167a = i10;
        this.f35168b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35167a) {
            case 0:
                e3 e3Var = (e3) this.f35168b;
                e3Var.G = f7;
                e3Var.c();
                return;
            case 1:
                o8 o8Var = (o8) this.f35168b;
                o8Var.e = f7;
                o8Var.setScaleX(f7);
                o8Var.setScaleY(f7);
                return;
            case 2:
                o9 o9Var = (o9) this.f35168b;
                o9Var.Y = f7;
                o9Var.A0();
                return;
            default:
                ((n9) this.f35168b).f34648c.setConversionWobble(f7);
                return;
        }
    }
}
