package org.telegram.ui;
public final class l9 implements r1.d {
    public final int f49480a;
    public final t9 f49481b;

    public l9(t9 t9Var, int i7) {
        this.f49480a = i7;
        this.f49481b = t9Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        float f12;
        switch (this.f49480a) {
            case 0:
                t9 t9Var = this.f49481b;
                t9Var.F = f10 / 500.0f;
                t9Var.fragmentView.invalidate();
                return;
            default:
                t9 t9Var2 = this.f49481b;
                if (t9Var2.O) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                t9Var2.f52217c0 = f12;
                t9Var2.fragmentView.invalidate();
                return;
        }
    }
}
