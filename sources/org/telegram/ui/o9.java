package org.telegram.ui;
public final class o9 implements o1.g {
    public final int f36246a;
    public final w9 f36247b;

    public o9(w9 w9Var, int i10) {
        this.f36246a = i10;
        this.f36247b = w9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f36246a) {
            case 0:
                w9 w9Var = this.f36247b;
                w9Var.f38614y = f7 / 500.0f;
                w9Var.fragmentView.invalidate();
                return;
            default:
                w9 w9Var2 = this.f36247b;
                if (w9Var2.M) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                w9Var2.f38601a0 = f11;
                w9Var2.fragmentView.invalidate();
                return;
        }
    }
}
