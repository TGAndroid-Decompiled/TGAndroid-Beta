package org.telegram.ui;
public final class p9 implements o1.g {
    public final int f36352a;
    public final x9 f36353b;

    public p9(x9 x9Var, int i10) {
        this.f36352a = i10;
        this.f36353b = x9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f36352a) {
            case 0:
                x9 x9Var = this.f36353b;
                x9Var.f39582y = f7 / 500.0f;
                x9Var.fragmentView.invalidate();
                return;
            default:
                x9 x9Var2 = this.f36353b;
                if (x9Var2.M) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                x9Var2.f39569a0 = f11;
                x9Var2.fragmentView.invalidate();
                return;
        }
    }
}
