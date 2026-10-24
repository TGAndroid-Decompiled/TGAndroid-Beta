package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f40104a;
    public final w9 f40105b;

    public o9(w9 w9Var, int i10) {
        this.f40104a = i10;
        this.f40105b = w9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f40104a) {
            case 0:
                w9 w9Var = this.f40105b;
                w9Var.E = f7 / 500.0f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                w9 w9Var2 = this.f40105b;
                if (w9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                w9Var2.f42951b0 = f11;
                w9Var2.fragmentView.invalidate();
                return;
        }
    }
}
