package org.telegram.ui.Wallet;
public final class t2 implements o1.g {
    public final int f35604a;
    public final Object f35605b;

    public t2(Object obj, int i10) {
        this.f35604a = i10;
        this.f35605b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35604a) {
            case 0:
                z2 z2Var = (z2) this.f35605b;
                z2Var.G = f7;
                z2Var.c();
                return;
            case 1:
                l8 l8Var = (l8) this.f35605b;
                l8Var.Y = f7;
                l8Var.A0();
                return;
            default:
                ((k8) this.f35605b).f35208c.setConversionWobble(f7);
                return;
        }
    }
}
