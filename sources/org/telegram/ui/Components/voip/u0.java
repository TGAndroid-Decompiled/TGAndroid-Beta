package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29677a = 0;
    public int f29678b;
    public final x0 f29679c;

    public u0(x0 x0Var) {
        this.f29679c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29677a;
        x0 x0Var = this.f29679c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29746y) {
                x0Var.f29741n = 1;
            } else {
                x0Var.f29741n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29746y) {
            this.f29678b = 1;
        } else {
            this.f29678b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29679c;
        x0Var.f29745x = i10;
        x0Var.f29744w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29677a = i10;
        if (i10 == 0) {
            int i11 = this.f29678b;
            x0 x0Var = this.f29679c;
            x0Var.f29741n = i11;
            x0.a(x0Var);
        }
    }
}
