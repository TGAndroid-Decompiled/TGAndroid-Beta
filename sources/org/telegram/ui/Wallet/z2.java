package org.telegram.ui.Wallet;
public final class z2 implements o1.g {
    public final int f37551a;
    public final Object f37552b;

    public z2(Object obj, int i10) {
        this.f37551a = i10;
        this.f37552b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f37551a) {
            case 0:
                f3 f3Var = (f3) this.f37552b;
                f3Var.G = f7;
                f3Var.c();
                return;
            case 1:
                i8 i8Var = (i8) this.f37552b;
                i8Var.e = f7;
                i8Var.setScaleX(f7);
                i8Var.setScaleY(f7);
                return;
            case 2:
                i9 i9Var = (i9) this.f37552b;
                i9Var.f36689b0 = f7;
                i9Var.C0();
                return;
            default:
                ((h9) this.f37552b).d.setConversionWobble(f7);
                return;
        }
    }
}
