package org.telegram.ui;
public final class p9 implements o1.g {
    public final int f37023a;
    public final x9 f37024b;

    public p9(x9 x9Var, int i10) {
        this.f37023a = i10;
        this.f37024b = x9Var;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        float f12;
        switch (this.f37023a) {
            case 0:
                x9 x9Var = this.f37024b;
                x9Var.f39937y = f10 / 500.0f;
                x9Var.fragmentView.invalidate();
                return;
            default:
                x9 x9Var2 = this.f37024b;
                if (x9Var2.J) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                x9Var2.X = f12;
                x9Var2.fragmentView.invalidate();
                return;
        }
    }
}
