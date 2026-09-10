package org.telegram.ui;
public final class m9 implements o1.g {
    public final int f34867a;
    public final u9 f34868b;

    public m9(u9 u9Var, int i10) {
        this.f34867a = i10;
        this.f34868b = u9Var;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        float f11;
        switch (this.f34867a) {
            case 0:
                u9 u9Var = this.f34868b;
                u9Var.f37174y = f7 / 500.0f;
                u9Var.fragmentView.invalidate();
                return;
            default:
                u9 u9Var2 = this.f34868b;
                if (u9Var2.M) {
                    f11 = f7 / 500.0f;
                } else {
                    f11 = 1.0f - (f7 / 500.0f);
                }
                u9Var2.f37161a0 = f11;
                u9Var2.fragmentView.invalidate();
                return;
        }
    }
}
