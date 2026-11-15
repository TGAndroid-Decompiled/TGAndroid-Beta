package org.telegram.ui.Wallet;
public final class p3 implements r1.d {
    public final int f44303a;
    public final Object f44304b;

    public p3(Object obj, int i7) {
        this.f44303a = i7;
        this.f44304b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f44303a) {
            case 0:
                v3 v3Var = (v3) this.f44304b;
                v3Var.H = f10;
                v3Var.c();
                return;
            case 1:
                q8 q8Var = (q8) this.f44304b;
                q8Var.f44398e = f10;
                q8Var.setScaleX(f10);
                q8Var.setScaleY(f10);
                return;
            case 2:
                p9 p9Var = (p9) this.f44304b;
                p9Var.f44335c0 = f10;
                p9Var.G0();
                return;
            default:
                ((o9) this.f44304b).d.setConversionWobble(f10);
                return;
        }
    }
}
