package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f39130a;
    public final w9 f39131b;

    public o9(w9 w9Var, int i10) {
        this.f39130a = i10;
        this.f39131b = w9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f39130a) {
            case 0:
                w9 w9Var = this.f39131b;
                w9Var.f41976y = f7 / 500.0f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                w9 w9Var2 = this.f39131b;
                if (w9Var2.M) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                w9Var2.f41962a0 = f11;
                w9Var2.fragmentView.invalidate();
                return;
        }
    }
}
