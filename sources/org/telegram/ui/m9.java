package org.telegram.ui;
public final class m9 implements o1.g {
    public final int f35651a;
    public final u9 f35652b;

    public m9(u9 u9Var, int i10) {
        this.f35651a = i10;
        this.f35652b = u9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f35651a) {
            case 0:
                u9 u9Var = this.f35652b;
                u9Var.f37907y = f7 / 500.0f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                u9 u9Var2 = this.f35652b;
                if (u9Var2.M) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                u9Var2.f37894a0 = f11;
                u9Var2.fragmentView.invalidate();
                return;
        }
    }
}
