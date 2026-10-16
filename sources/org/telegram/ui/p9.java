package org.telegram.ui;
public final class p9 implements o1.g {
    public final int f38849a;
    public final z9 f38850b;

    public p9(z9 z9Var, int i10) {
        this.f38849a = i10;
        this.f38850b = z9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f38849a) {
            case 0:
                z9 z9Var = this.f38850b;
                z9Var.E = f7 / 500.0f;
                z9Var.fragmentView.invalidate();
                return;
            default:
                z9 z9Var2 = this.f38850b;
                if (z9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                z9Var2.f42226c0 = f11;
                z9Var2.fragmentView.invalidate();
                return;
        }
    }
}
