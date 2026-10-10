package org.telegram.ui.Wallet;
public final class x5 implements o1.g {
    public final int f35704a;
    public final d6 f35705b;

    public x5(d6 d6Var, int i10) {
        this.f35704a = i10;
        this.f35705b = d6Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.f35704a) {
            case 0:
                d6 d6Var = this.f35705b;
                d6Var.f34822c.setScaleX(f7);
                d6Var.f34822c.setScaleY(f7);
                return;
            default:
                this.f35705b.P = f10;
                return;
        }
    }
}
