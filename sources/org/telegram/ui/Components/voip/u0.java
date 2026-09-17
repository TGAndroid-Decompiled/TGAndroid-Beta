package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29252a = 0;
    public int f29253b;
    public final x0 f29254c;

    public u0(x0 x0Var) {
        this.f29254c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29252a;
        x0 x0Var = this.f29254c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29326y) {
                x0Var.f29321n = 1;
            } else {
                x0Var.f29321n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29326y) {
            this.f29253b = 1;
        } else {
            this.f29253b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29254c;
        x0Var.f29325x = i10;
        x0Var.f29324w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29252a = i10;
        if (i10 == 0) {
            int i11 = this.f29253b;
            x0 x0Var = this.f29254c;
            x0Var.f29321n = i11;
            x0.a(x0Var);
        }
    }
}
