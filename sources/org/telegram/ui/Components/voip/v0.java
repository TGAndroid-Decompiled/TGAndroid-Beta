package org.telegram.ui.Components.voip;
public final class v0 implements c5.h {
    public int f41001a = 0;
    public int f41002b;
    public final x0 f41003c;

    public v0(x0 x0Var) {
        this.f41003c = x0Var;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f41001a;
        x0 x0Var = this.f41003c;
        if (i10 == 0) {
            if (i7 <= x0Var.E) {
                x0Var.f41040n = 1;
            } else {
                x0Var.f41040n = 2;
            }
            x0.a(x0Var);
        } else if (i7 <= x0Var.E) {
            this.f41002b = 1;
        } else {
            this.f41002b = 2;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        x0 x0Var = this.f41003c;
        x0Var.f41045y = i7;
        x0Var.f41044x = f10;
        x0Var.d();
    }

    @Override
    public final void c(int i7) {
        this.f41001a = i7;
        if (i7 == 0) {
            int i10 = this.f41002b;
            x0 x0Var = this.f41003c;
            x0Var.f41040n = i10;
            x0.a(x0Var);
        }
    }
}
