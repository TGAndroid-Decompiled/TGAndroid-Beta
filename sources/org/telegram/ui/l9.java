package org.telegram.ui;
public final class l9 implements o1.g {
    public final int f39093a;
    public final u9 f39094b;

    public l9(u9 u9Var, int i10) {
        this.f39093a = i10;
        this.f39094b = u9Var;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        float f11;
        switch (this.f39093a) {
            case 0:
                u9 u9Var = this.f39094b;
                u9Var.E = f7 / 500.0f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                u9 u9Var2 = this.f39094b;
                if (u9Var2.N) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                u9Var2.f42080b0 = f11;
                u9Var2.fragmentView.invalidate();
                return;
        }
    }
}
