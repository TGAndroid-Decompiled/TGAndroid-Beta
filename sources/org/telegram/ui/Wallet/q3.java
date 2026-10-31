package org.telegram.ui.Wallet;
public final class q3 implements o1.g {
    public final int f35062a;
    public final Object f35063b;

    public q3(Object obj, int i10) {
        this.f35062a = i10;
        this.f35063b = obj;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.f35062a) {
            case 0:
                w3 w3Var = (w3) this.f35063b;
                w3Var.G = f7;
                w3Var.c();
                return;
            case 1:
                u8 u8Var = (u8) this.f35063b;
                u8Var.e = f7;
                u8Var.setScaleX(f7);
                u8Var.setScaleY(f7);
                return;
            case 2:
                r9 r9Var = (r9) this.f35063b;
                r9Var.f35126b0 = f7;
                r9Var.F0();
                return;
            default:
                ((q9) this.f35063b).d.setConversionWobble(f7);
                return;
        }
    }
}
