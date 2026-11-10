package org.telegram.ui;
public final class k9 implements r1.d {
    public final int f47222a;
    public final s9 f47223b;

    public k9(s9 s9Var, int i7) {
        this.f47222a = i7;
        this.f47223b = s9Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        float f12;
        switch (this.f47222a) {
            case 0:
                s9 s9Var = this.f47223b;
                s9Var.E = f10 / 500.0f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                s9 s9Var2 = this.f47223b;
                if (s9Var2.N) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                s9Var2.f49741b0 = f12;
                s9Var2.fragmentView.invalidate();
                return;
        }
    }
}
