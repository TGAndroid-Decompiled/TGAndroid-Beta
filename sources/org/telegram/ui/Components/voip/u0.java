package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f32352a = 0;
    public int f32353b;
    public final x0 f32354c;

    public u0(x0 x0Var) {
        this.f32354c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32352a;
        x0 x0Var = this.f32354c;
        if (i11 == 0) {
            if (i10 <= x0Var.f32433y) {
                x0Var.f32428n = 1;
            } else {
                x0Var.f32428n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f32433y) {
            this.f32353b = 1;
        } else {
            this.f32353b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f32354c;
        x0Var.f32432x = i10;
        x0Var.f32431w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32352a = i10;
        if (i10 == 0) {
            int i11 = this.f32353b;
            x0 x0Var = this.f32354c;
            x0Var.f32428n = i11;
            x0.a(x0Var);
        }
    }
}
