package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f32206a = 0;
    public int f32207b;
    public final x0 f32208c;

    public u0(x0 x0Var) {
        this.f32208c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32206a;
        x0 x0Var = this.f32208c;
        if (i11 == 0) {
            if (i10 <= x0Var.f32281y) {
                x0Var.f32276n = 1;
            } else {
                x0Var.f32276n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f32281y) {
            this.f32207b = 1;
        } else {
            this.f32207b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f32208c;
        x0Var.f32280x = i10;
        x0Var.f32279w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32206a = i10;
        if (i10 == 0) {
            int i11 = this.f32207b;
            x0 x0Var = this.f32208c;
            x0Var.f32276n = i11;
            x0.a(x0Var);
        }
    }
}
