package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f40580a;
    public final y9 f40581b;

    public o9(y9 y9Var, int i10) {
        this.f40580a = i10;
        this.f40581b = y9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f40580a) {
            case 0:
                y9 y9Var = this.f40581b;
                y9Var.E = f7 / 500.0f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                y9 y9Var2 = this.f40581b;
                if (y9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                y9Var2.f44336c0 = f11;
                y9Var2.fragmentView.invalidate();
                return;
        }
    }
}
