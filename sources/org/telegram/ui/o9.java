package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f40577a;
    public final y9 f40578b;

    public o9(y9 y9Var, int i10) {
        this.f40577a = i10;
        this.f40578b = y9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f40577a) {
            case 0:
                y9 y9Var = this.f40578b;
                y9Var.E = f7 / 500.0f;
                y9Var.fragmentView.invalidate();
                return;
            default:
                y9 y9Var2 = this.f40578b;
                if (y9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                y9Var2.f44331c0 = f11;
                y9Var2.fragmentView.invalidate();
                return;
        }
    }
}
