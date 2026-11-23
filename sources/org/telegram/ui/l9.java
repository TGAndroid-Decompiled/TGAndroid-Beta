package org.telegram.ui;
public final class l9 implements r1.d {
    public final int f49524a;
    public final t9 f49525b;

    public l9(t9 t9Var, int i7) {
        this.f49524a = i7;
        this.f49525b = t9Var;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        float f12;
        switch (this.f49524a) {
            case 0:
                t9 t9Var = this.f49525b;
                t9Var.F = f10 / 500.0f;
                t9Var.fragmentView.invalidate();
                return;
            default:
                t9 t9Var2 = this.f49525b;
                if (t9Var2.O) {
                    f12 = f10 / 500.0f;
                } else {
                    f12 = 1.0f - (f10 / 500.0f);
                }
                t9Var2.f52271c0 = f12;
                t9Var2.fragmentView.invalidate();
                return;
        }
    }
}
