package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29678a = 0;
    public int f29679b;
    public final x0 f29680c;

    public u0(x0 x0Var) {
        this.f29680c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29678a;
        x0 x0Var = this.f29680c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29747y) {
                x0Var.f29742n = 1;
            } else {
                x0Var.f29742n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29747y) {
            this.f29679b = 1;
        } else {
            this.f29679b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29680c;
        x0Var.f29746x = i10;
        x0Var.f29745w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29678a = i10;
        if (i10 == 0) {
            int i11 = this.f29679b;
            x0 x0Var = this.f29680c;
            x0Var.f29742n = i11;
            x0.a(x0Var);
        }
    }
}
