package org.telegram.ui.Wallet;
public final class z3 implements r1.d {
    public final int f45477a;
    public final Object f45478b;

    public z3(Object obj, int i7) {
        this.f45477a = i7;
        this.f45478b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.f45477a) {
            case 0:
                g4 g4Var = (g4) this.f45478b;
                g4Var.H = f10;
                g4Var.d();
                return;
            case 1:
                f9 f9Var = (f9) this.f45478b;
                f9Var.f44314e = f10;
                f9Var.setScaleX(f10);
                f9Var.setScaleY(f10);
                return;
            case 2:
                ea eaVar = (ea) this.f45478b;
                eaVar.f44227c0 = f10;
                eaVar.G0();
                return;
            default:
                ((da) this.f45478b).d.setConversionWobble(f10);
                return;
        }
    }
}
