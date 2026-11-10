package org.telegram.ui.Wallet;
public final class q3 implements r1.d {
    public final int f43045a;
    public final Object f43046b;

    public q3(Object obj, int i7) {
        this.f43045a = i7;
        this.f43046b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43045a) {
            case 0:
                w3 w3Var = (w3) this.f43046b;
                w3Var.G = f10;
                w3Var.c();
                return;
            case 1:
                q8 q8Var = (q8) this.f43046b;
                q8Var.f43077e = f10;
                q8Var.setScaleX(f10);
                q8Var.setScaleY(f10);
                return;
            case 2:
                o9 o9Var = (o9) this.f43046b;
                o9Var.f42917b0 = f10;
                o9Var.G0();
                return;
            default:
                ((n9) this.f43046b).d.setConversionWobble(f10);
                return;
        }
    }
}
