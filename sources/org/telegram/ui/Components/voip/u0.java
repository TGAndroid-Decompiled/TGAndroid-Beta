package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29246a = 0;
    public int f29247b;
    public final x0 f29248c;

    public u0(x0 x0Var) {
        this.f29248c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29246a;
        x0 x0Var = this.f29248c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29320y) {
                x0Var.f29315n = 1;
            } else {
                x0Var.f29315n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29320y) {
            this.f29247b = 1;
        } else {
            this.f29247b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29248c;
        x0Var.f29319x = i10;
        x0Var.f29318w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29246a = i10;
        if (i10 == 0) {
            int i11 = this.f29247b;
            x0 x0Var = this.f29248c;
            x0Var.f29315n = i11;
            x0.a(x0Var);
        }
    }
}
