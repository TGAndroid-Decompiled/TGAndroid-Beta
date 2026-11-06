package org.telegram.ui;
public final class k9 implements r1.d {
    public final int f47121a;
    public final s9 f47122b;

    public k9(s9 s9Var, int i7) {
        this.f47121a = i7;
        this.f47122b = s9Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        float f12;
        switch (this.f47121a) {
            case 0:
                s9 s9Var = this.f47122b;
                s9Var.E = f10 / 500.0f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                s9 s9Var2 = this.f47122b;
                if (s9Var2.N) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                s9Var2.f49668b0 = f12;
                s9Var2.fragmentView.invalidate();
                return;
        }
    }
}
