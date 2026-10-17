package org.telegram.ui.Wallet;
public final class y2 implements o1.g {
    public final int f35167a;
    public final Object f35168b;

    public y2(Object obj, int i10) {
        this.f35167a = i10;
        this.f35168b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35167a) {
            case 0:
                d3 d3Var = (d3) this.f35168b;
                d3Var.G = f7;
                d3Var.c();
                return;
            case 1:
                l8 l8Var = (l8) this.f35168b;
                l8Var.e = f7;
                l8Var.setScaleX(f7);
                l8Var.setScaleY(f7);
                return;
            case 2:
                l9 l9Var = (l9) this.f35168b;
                l9Var.Y = f7;
                l9Var.A0();
                return;
            default:
                ((k9) this.f35168b).f34445c.setConversionWobble(f7);
                return;
        }
    }
}
