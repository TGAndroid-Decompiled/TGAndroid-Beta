package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f32213a = 0;
    public int f32214b;
    public final x0 f32215c;

    public u0(x0 x0Var) {
        this.f32215c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32213a;
        x0 x0Var = this.f32215c;
        if (i11 == 0) {
            if (i10 <= x0Var.f32288y) {
                x0Var.f32283n = 1;
            } else {
                x0Var.f32283n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f32288y) {
            this.f32214b = 1;
        } else {
            this.f32214b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f32215c;
        x0Var.f32287x = i10;
        x0Var.f32286w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32213a = i10;
        if (i10 == 0) {
            int i11 = this.f32214b;
            x0 x0Var = this.f32215c;
            x0Var.f32283n = i11;
            x0.a(x0Var);
        }
    }
}
