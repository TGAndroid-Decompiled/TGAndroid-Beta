package org.telegram.ui;
public final class l9 implements o1.g {
    public final int f39476a;
    public final v9 f39477b;

    public l9(v9 v9Var, int i10) {
        this.f39476a = i10;
        this.f39477b = v9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f39476a) {
            case 0:
                v9 v9Var = this.f39477b;
                v9Var.E = f7 / 500.0f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                v9 v9Var2 = this.f39477b;
                if (v9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                v9Var2.f42716c0 = f11;
                v9Var2.fragmentView.invalidate();
                return;
        }
    }
}
