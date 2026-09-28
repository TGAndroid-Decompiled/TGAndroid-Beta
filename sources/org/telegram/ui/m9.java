package org.telegram.ui;
public final class m9 implements o1.g {
    public final int f35502a;
    public final u9 f35503b;

    public m9(u9 u9Var, int i10) {
        this.f35502a = i10;
        this.f35503b = u9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f35502a) {
            case 0:
                u9 u9Var = this.f35503b;
                u9Var.f38369y = f7 / 500.0f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                u9 u9Var2 = this.f35503b;
                if (u9Var2.M) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                u9Var2.f38356a0 = f11;
                u9Var2.fragmentView.invalidate();
                return;
        }
    }
}
