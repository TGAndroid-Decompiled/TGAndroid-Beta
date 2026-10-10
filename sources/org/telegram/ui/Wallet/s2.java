package org.telegram.ui.Wallet;
public final class s2 implements o1.g {
    public final int f35540a;
    public final Object f35541b;

    public s2(Object obj, int i10) {
        this.f35540a = i10;
        this.f35541b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35540a) {
            case 0:
                y2 y2Var = (y2) this.f35541b;
                y2Var.G = f7;
                y2Var.c();
                return;
            case 1:
                k8 k8Var = (k8) this.f35541b;
                k8Var.Y = f7;
                k8Var.A0();
                return;
            default:
                ((j8) this.f35541b).f35144c.setConversionWobble(f7);
                return;
        }
    }
}
