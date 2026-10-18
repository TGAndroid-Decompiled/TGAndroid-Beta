package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f39711a;
    public final y9 f39712b;

    public o9(y9 y9Var, int i10) {
        this.f39711a = i10;
        this.f39712b = y9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f39711a) {
            case 0:
                y9 y9Var = this.f39712b;
                y9Var.F = f7 / 500.0f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                y9 y9Var2 = this.f39712b;
                if (y9Var2.O) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                y9Var2.f43379d0 = f11;
                y9Var2.fragmentView.invalidate();
                return;
        }
    }
}
