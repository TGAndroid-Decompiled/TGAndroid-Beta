package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29571a = 0;
    public int f29572b;
    public final x0 f29573c;

    public u0(x0 x0Var) {
        this.f29573c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29571a;
        x0 x0Var = this.f29573c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29645y) {
                x0Var.f29640n = 1;
            } else {
                x0Var.f29640n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29645y) {
            this.f29572b = 1;
        } else {
            this.f29572b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29573c;
        x0Var.f29644x = i10;
        x0Var.f29643w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29571a = i10;
        if (i10 == 0) {
            int i11 = this.f29572b;
            x0 x0Var = this.f29573c;
            x0Var.f29640n = i11;
            x0.a(x0Var);
        }
    }
}
