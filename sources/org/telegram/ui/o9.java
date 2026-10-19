package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f39793a;
    public final w9 f39794b;

    public o9(w9 w9Var, int i10) {
        this.f39793a = i10;
        this.f39794b = w9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f39793a) {
            case 0:
                w9 w9Var = this.f39794b;
                w9Var.E = f7 / 500.0f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                w9 w9Var2 = this.f39794b;
                if (w9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                w9Var2.f42498b0 = f11;
                w9Var2.fragmentView.invalidate();
                return;
        }
    }
}
