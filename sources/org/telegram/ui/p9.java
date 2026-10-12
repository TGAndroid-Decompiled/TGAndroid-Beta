package org.telegram.ui;
public final class p9 implements o1.g {
    public final int f39155a;
    public final z9 f39156b;

    public p9(z9 z9Var, int i10) {
        this.f39155a = i10;
        this.f39156b = z9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f39155a) {
            case 0:
                z9 z9Var = this.f39156b;
                z9Var.E = f7 / 500.0f;
                z9Var.fragmentView.invalidate();
                return;
            default:
                z9 z9Var2 = this.f39156b;
                if (z9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                z9Var2.f42552c0 = f11;
                z9Var2.fragmentView.invalidate();
                return;
        }
    }
}
