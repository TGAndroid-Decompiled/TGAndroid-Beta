package org.telegram.ui;
public final class n9 implements o1.g {
    public final int f39351a;
    public final v9 f39352b;

    public n9(v9 v9Var, int i10) {
        this.f39351a = i10;
        this.f39352b = v9Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        float f12;
        switch (this.f39351a) {
            case 0:
                v9 v9Var = this.f39352b;
                v9Var.f42179y = f10 / 500.0f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                v9 v9Var2 = this.f39352b;
                if (v9Var2.J) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                v9Var2.X = f12;
                v9Var2.fragmentView.invalidate();
                return;
        }
    }
}
