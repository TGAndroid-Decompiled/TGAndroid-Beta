package org.telegram.ui.Wallet;
public final class q3 implements r1.d {
    public final int f43050a;
    public final Object f43051b;

    public q3(Object obj, int i7) {
        this.f43050a = i7;
        this.f43051b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43050a) {
            case 0:
                w3 w3Var = (w3) this.f43051b;
                w3Var.G = f10;
                w3Var.c();
                return;
            case 1:
                p8 p8Var = (p8) this.f43051b;
                p8Var.f43022e = f10;
                p8Var.setScaleX(f10);
                p8Var.setScaleY(f10);
                return;
            case 2:
                n9 n9Var = (n9) this.f43051b;
                n9Var.f42846b0 = f10;
                n9Var.G0();
                return;
            default:
                ((m9) this.f43051b).d.setConversionWobble(f10);
                return;
        }
    }
}
