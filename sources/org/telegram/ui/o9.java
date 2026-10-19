package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f39794a;
    public final w9 f39795b;

    public o9(w9 w9Var, int i10) {
        this.f39794a = i10;
        this.f39795b = w9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f39794a) {
            case 0:
                w9 w9Var = this.f39795b;
                w9Var.E = f7 / 500.0f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                w9 w9Var2 = this.f39795b;
                if (w9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                w9Var2.f42497b0 = f11;
                w9Var2.fragmentView.invalidate();
                return;
        }
    }
}
