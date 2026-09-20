package org.telegram.ui;
public final class n9 implements o1.g {
    public final int f35913a;
    public final v9 f35914b;

    public n9(v9 v9Var, int i10) {
        this.f35913a = i10;
        this.f35914b = v9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f35913a) {
            case 0:
                v9 v9Var = this.f35914b;
                v9Var.f38451y = f7 / 500.0f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                v9 v9Var2 = this.f35914b;
                if (v9Var2.M) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                v9Var2.f38438a0 = f11;
                v9Var2.fragmentView.invalidate();
                return;
        }
    }
}
