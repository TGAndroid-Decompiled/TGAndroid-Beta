package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29275a = 0;
    public int f29276b;
    public final x0 f29277c;

    public u0(x0 x0Var) {
        this.f29277c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29275a;
        x0 x0Var = this.f29277c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29349y) {
                x0Var.f29344n = 1;
            } else {
                x0Var.f29344n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29349y) {
            this.f29276b = 1;
        } else {
            this.f29276b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29277c;
        x0Var.f29348x = i10;
        x0Var.f29347w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29275a = i10;
        if (i10 == 0) {
            int i11 = this.f29276b;
            x0 x0Var = this.f29277c;
            x0Var.f29344n = i11;
            x0.a(x0Var);
        }
    }
}
