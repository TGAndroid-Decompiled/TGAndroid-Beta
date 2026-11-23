package org.telegram.ui.Components.voip;
public final class v0 implements c5.h {
    public int f41277a = 0;
    public int f41278b;
    public final x0 f41279c;

    public v0(x0 x0Var) {
        this.f41279c = x0Var;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f41277a;
        x0 x0Var = this.f41279c;
        if (i10 == 0) {
            if (i7 <= x0Var.E) {
                x0Var.f41316n = 1;
            } else {
                x0Var.f41316n = 2;
            }
            x0.a(x0Var);
        } else if (i7 <= x0Var.E) {
            this.f41278b = 1;
        } else {
            this.f41278b = 2;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        x0 x0Var = this.f41279c;
        x0Var.f41321y = i7;
        x0Var.f41320x = f10;
        x0Var.d();
    }

    @Override
    public final void c(int i7) {
        this.f41277a = i7;
        if (i7 == 0) {
            int i10 = this.f41278b;
            x0 x0Var = this.f41279c;
            x0Var.f41316n = i10;
            x0.a(x0Var);
        }
    }
}
