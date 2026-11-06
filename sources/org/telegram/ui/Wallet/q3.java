package org.telegram.ui.Wallet;
public final class q3 implements r1.d {
    public final int f43025a;
    public final Object f43026b;

    public q3(Object obj, int i7) {
        this.f43025a = i7;
        this.f43026b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43025a) {
            case 0:
                w3 w3Var = (w3) this.f43026b;
                w3Var.G = f10;
                w3Var.c();
                return;
            case 1:
                p8 p8Var = (p8) this.f43026b;
                p8Var.f42997e = f10;
                p8Var.setScaleX(f10);
                p8Var.setScaleY(f10);
                return;
            case 2:
                n9 n9Var = (n9) this.f43026b;
                n9Var.f42821b0 = f10;
                n9Var.G0();
                return;
            default:
                ((m9) this.f43026b).d.setConversionWobble(f10);
                return;
        }
    }
}
