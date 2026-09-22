package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29640a = 0;
    public int f29641b;
    public final x0 f29642c;

    public u0(x0 x0Var) {
        this.f29642c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29640a;
        x0 x0Var = this.f29642c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29714y) {
                x0Var.f29709n = 1;
            } else {
                x0Var.f29709n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29714y) {
            this.f29641b = 1;
        } else {
            this.f29641b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29642c;
        x0Var.f29713x = i10;
        x0Var.f29712w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29640a = i10;
        if (i10 == 0) {
            int i11 = this.f29641b;
            x0 x0Var = this.f29642c;
            x0Var.f29709n = i11;
            x0.a(x0Var);
        }
    }
}
