package org.telegram.ui.Components.voip;
public final class v0 implements c5.h {
    public int f40998a = 0;
    public int f40999b;
    public final x0 f41000c;

    public v0(x0 x0Var) {
        this.f41000c = x0Var;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f40998a;
        x0 x0Var = this.f41000c;
        if (i10 == 0) {
            if (i7 <= x0Var.E) {
                x0Var.f41037n = 1;
            } else {
                x0Var.f41037n = 2;
            }
            x0.a(x0Var);
        } else if (i7 <= x0Var.E) {
            this.f40999b = 1;
        } else {
            this.f40999b = 2;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        x0 x0Var = this.f41000c;
        x0Var.f41042y = i7;
        x0Var.f41041x = f10;
        x0Var.d();
    }

    @Override
    public final void c(int i7) {
        this.f40998a = i7;
        if (i7 == 0) {
            int i10 = this.f40999b;
            x0 x0Var = this.f41000c;
            x0Var.f41037n = i10;
            x0.a(x0Var);
        }
    }
}
