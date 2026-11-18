package org.telegram.ui.Wallet;
public final class y3 implements r1.d {
    public final int f45305a;
    public final Object f45306b;

    public y3(Object obj, int i7) {
        this.f45305a = i7;
        this.f45306b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f45305a) {
            case 0:
                f4 f4Var = (f4) this.f45306b;
                f4Var.H = f10;
                f4Var.d();
                return;
            case 1:
                e9 e9Var = (e9) this.f45306b;
                e9Var.f44141e = f10;
                e9Var.setScaleX(f10);
                e9Var.setScaleY(f10);
                return;
            case 2:
                da daVar = (da) this.f45306b;
                daVar.f44055c0 = f10;
                daVar.G0();
                return;
            default:
                ((ca) this.f45306b).d.setConversionWobble(f10);
                return;
        }
    }
}
