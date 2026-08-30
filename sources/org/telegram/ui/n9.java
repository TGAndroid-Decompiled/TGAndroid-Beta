package org.telegram.ui;
public final class n9 implements o1.g {
    public final int f36522a;
    public final v9 f36523b;

    public n9(v9 v9Var, int i10) {
        this.f36522a = i10;
        this.f36523b = v9Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        float f12;
        switch (this.f36522a) {
            case 0:
                v9 v9Var = this.f36523b;
                v9Var.f39118y = f10 / 500.0f;
                v9Var.fragmentView.invalidate();
                return;
            default:
                v9 v9Var2 = this.f36523b;
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
