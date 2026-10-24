package org.telegram.ui.Wallet;
public final class z2 implements o1.g {
    public final int f35488a;
    public final Object f35489b;

    public z2(Object obj, int i10) {
        this.f35488a = i10;
        this.f35489b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35488a) {
            case 0:
                f3 f3Var = (f3) this.f35489b;
                f3Var.G = f7;
                f3Var.c();
                return;
            case 1:
                j8 j8Var = (j8) this.f35489b;
                j8Var.e = f7;
                j8Var.setScaleX(f7);
                j8Var.setScaleY(f7);
                return;
            case 2:
                j9 j9Var = (j9) this.f35489b;
                j9Var.f34659a0 = f7;
                j9Var.B0();
                return;
            default:
                ((i9) this.f35489b).d.setConversionWobble(f7);
                return;
        }
    }
}
