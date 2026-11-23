package org.telegram.ui.Wallet;
public final class y3 implements r1.d {
    public final int f45315a;
    public final Object f45316b;

    public y3(Object obj, int i7) {
        this.f45315a = i7;
        this.f45316b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f45315a) {
            case 0:
                f4 f4Var = (f4) this.f45316b;
                f4Var.H = f10;
                f4Var.d();
                return;
            case 1:
                e9 e9Var = (e9) this.f45316b;
                e9Var.f44151e = f10;
                e9Var.setScaleX(f10);
                e9Var.setScaleY(f10);
                return;
            case 2:
                da daVar = (da) this.f45316b;
                daVar.f44065c0 = f10;
                daVar.G0();
                return;
            default:
                ((ca) this.f45316b).d.setConversionWobble(f10);
                return;
        }
    }
}
