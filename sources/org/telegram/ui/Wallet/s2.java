package org.telegram.ui.Wallet;
public final class s2 implements o1.g {
    public final int f33421a;
    public final Object f33422b;

    public s2(Object obj, int i10) {
        this.f33421a = i10;
        this.f33422b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f33421a) {
            case 0:
                y2 y2Var = (y2) this.f33422b;
                y2Var.G = f7;
                y2Var.c();
                return;
            case 1:
                j8 j8Var = (j8) this.f33422b;
                j8Var.Y = f7;
                j8Var.A0();
                return;
            default:
                ((i8) this.f33422b).f33035c.setConversionWobble(f7);
                return;
        }
    }
}
