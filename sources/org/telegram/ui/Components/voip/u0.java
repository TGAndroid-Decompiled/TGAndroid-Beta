package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f29589a = 0;
    public int f29590b;
    public final x0 f29591c;

    public u0(x0 x0Var) {
        this.f29591c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29589a;
        x0 x0Var = this.f29591c;
        if (i11 == 0) {
            if (i10 <= x0Var.f29658y) {
                x0Var.f29653n = 1;
            } else {
                x0Var.f29653n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f29658y) {
            this.f29590b = 1;
        } else {
            this.f29590b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f29591c;
        x0Var.f29657x = i10;
        x0Var.f29656w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29589a = i10;
        if (i10 == 0) {
            int i11 = this.f29590b;
            x0 x0Var = this.f29591c;
            x0Var.f29653n = i11;
            x0.a(x0Var);
        }
    }
}
