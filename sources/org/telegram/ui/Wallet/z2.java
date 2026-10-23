package org.telegram.ui.Wallet;
public final class z2 implements o1.g {
    public final int f35486a;
    public final Object f35487b;

    public z2(Object obj, int i10) {
        this.f35486a = i10;
        this.f35487b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35486a) {
            case 0:
                f3 f3Var = (f3) this.f35487b;
                f3Var.G = f7;
                f3Var.c();
                return;
            case 1:
                j8 j8Var = (j8) this.f35487b;
                j8Var.e = f7;
                j8Var.setScaleX(f7);
                j8Var.setScaleY(f7);
                return;
            case 2:
                j9 j9Var = (j9) this.f35487b;
                j9Var.f34657a0 = f7;
                j9Var.B0();
                return;
            default:
                ((i9) this.f35487b).d.setConversionWobble(f7);
                return;
        }
    }
}
