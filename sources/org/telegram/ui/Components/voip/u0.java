package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29272a = 0;
    public int f29273b;
    public final x0 f29274c;

    public u0(x0 x0Var) {
        this.f29274c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29272a;
        x0 x0Var = this.f29274c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29346y) {
                x0Var.f29341n = 1;
            } else {
                x0Var.f29341n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29346y) {
            this.f29273b = 1;
        } else {
            this.f29273b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29274c;
        x0Var.f29345x = i10;
        x0Var.f29344w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29272a = i10;
        if (i10 == 0) {
            int i11 = this.f29273b;
            x0 x0Var = this.f29274c;
            x0Var.f29341n = i11;
            x0.a(x0Var);
        }
    }
}
