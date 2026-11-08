package org.telegram.ui.Wallet;
public final class p3 implements r1.d {
    public final int f43018a;
    public final Object f43019b;

    public p3(Object obj, int i7) {
        this.f43018a = i7;
        this.f43019b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f43018a) {
            case 0:
                v3 v3Var = (v3) this.f43019b;
                v3Var.G = f10;
                v3Var.c();
                return;
            case 1:
                o8 o8Var = (o8) this.f43019b;
                o8Var.f42983e = f10;
                o8Var.setScaleX(f10);
                o8Var.setScaleY(f10);
                return;
            case 2:
                m9 m9Var = (m9) this.f43019b;
                m9Var.f42815b0 = f10;
                m9Var.G0();
                return;
            default:
                ((l9) this.f43019b).d.setConversionWobble(f10);
                return;
        }
    }
}
