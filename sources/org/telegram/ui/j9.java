package org.telegram.ui;
public final class j9 implements q1.d {
    public final int f46563a;
    public final s9 f46564b;

    public j9(s9 s9Var, int i3) {
        this.f46563a = i3;
        this.f46564b = s9Var;
    }

    @Override
    public final void a(q1.g gVar, float f10, float f11) {
        float f12;
        switch (this.f46563a) {
            case 0:
                s9 s9Var = this.f46564b;
                s9Var.F = f10 / 500.0f;
                s9Var.fragmentView.invalidate();
                return;
            default:
                s9 s9Var2 = this.f46564b;
                if (s9Var2.O) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                s9Var2.f49427c0 = f12;
                s9Var2.fragmentView.invalidate();
                return;
        }
    }
}
