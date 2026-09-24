package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29668a = 0;
    public int f29669b;
    public final x0 f29670c;

    public u0(x0 x0Var) {
        this.f29670c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29668a;
        x0 x0Var = this.f29670c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29737y) {
                x0Var.f29732n = 1;
            } else {
                x0Var.f29732n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29737y) {
            this.f29669b = 1;
        } else {
            this.f29669b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29670c;
        x0Var.f29736x = i10;
        x0Var.f29735w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29668a = i10;
        if (i10 == 0) {
            int i11 = this.f29669b;
            x0 x0Var = this.f29670c;
            x0Var.f29732n = i11;
            x0.a(x0Var);
        }
    }
}
