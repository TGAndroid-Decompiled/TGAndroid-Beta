package org.telegram.ui;
public final class j9 implements o1.h {
    public final int f39473a;
    public final r9 f39474b;

    public j9(r9 r9Var, int i10) {
        this.f39473a = i10;
        this.f39474b = r9Var;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        float f11;
        switch (this.f39473a) {
            case 0:
                r9 r9Var = this.f39474b;
                r9Var.f42011y = f9 / 500.0f;
                r9Var.fragmentView.invalidate();
                return;
            default:
                r9 r9Var2 = this.f39474b;
                if (r9Var2.I) {
                    f11 = f9 / 500.0f;
                } else {
                    f11 = 1.0f - (f9 / 500.0f);
                }
                r9Var2.W = f11;
                r9Var2.fragmentView.invalidate();
                return;
        }
    }
}
