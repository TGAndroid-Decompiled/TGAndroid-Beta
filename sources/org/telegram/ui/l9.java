package org.telegram.ui;
public final class l9 implements o1.g {
    public final int f39149a;
    public final u9 f39150b;

    public l9(u9 u9Var, int i10) {
        this.f39149a = i10;
        this.f39150b = u9Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        float f11;
        switch (this.f39149a) {
            case 0:
                u9 u9Var = this.f39150b;
                u9Var.E = f7 / 500.0f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                u9 u9Var2 = this.f39150b;
                if (u9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                u9Var2.f41882b0 = f11;
                u9Var2.fragmentView.invalidate();
                return;
        }
    }
}
