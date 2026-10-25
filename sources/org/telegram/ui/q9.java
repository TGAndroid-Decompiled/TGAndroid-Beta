package org.telegram.ui;
public final class q9 implements o1.g {
    public final int f42766a;
    public final y9 f42767b;

    public q9(y9 y9Var, int i10) {
        this.f42766a = i10;
        this.f42767b = y9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f42766a) {
            case 0:
                y9 y9Var = this.f42767b;
                y9Var.E = f7 / 500.0f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                y9 y9Var2 = this.f42767b;
                if (y9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                y9Var2.f45993b0 = f11;
                y9Var2.fragmentView.invalidate();
                return;
        }
    }
}
