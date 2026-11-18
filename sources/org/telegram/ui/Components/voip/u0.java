package org.telegram.ui.Components.voip;
public final class u0 implements c5.h {
    public int f41245a = 0;
    public int f41246b;
    public final w0 f41247c;

    public u0(w0 w0Var) {
        this.f41247c = w0Var;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f41245a;
        w0 w0Var = this.f41247c;
        if (i10 == 0) {
            if (i7 <= w0Var.E) {
                w0Var.f41284n = 1;
            } else {
                w0Var.f41284n = 2;
            }
            w0.a(w0Var);
        } else if (i7 <= w0Var.E) {
            this.f41246b = 1;
        } else {
            this.f41246b = 2;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        w0 w0Var = this.f41247c;
        w0Var.f41289y = i7;
        w0Var.f41288x = f10;
        w0Var.d();
    }

    @Override
    public final void c(int i7) {
        this.f41245a = i7;
        if (i7 == 0) {
            int i10 = this.f41246b;
            w0 w0Var = this.f41247c;
            w0Var.f41284n = i10;
            w0.a(w0Var);
        }
    }
}
