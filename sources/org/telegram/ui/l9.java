package org.telegram.ui;
public final class l9 implements o1.g {
    public final int f39474a;
    public final v9 f39475b;

    public l9(v9 v9Var, int i10) {
        this.f39474a = i10;
        this.f39475b = v9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f39474a) {
            case 0:
                v9 v9Var = this.f39475b;
                v9Var.E = f7 / 500.0f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                v9 v9Var2 = this.f39475b;
                if (v9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                v9Var2.f42714c0 = f11;
                v9Var2.fragmentView.invalidate();
                return;
        }
    }
}
