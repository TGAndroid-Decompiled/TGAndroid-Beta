package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f32207a = 0;
    public int f32208b;
    public final x0 f32209c;

    public u0(x0 x0Var) {
        this.f32209c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32207a;
        x0 x0Var = this.f32209c;
        if (i11 == 0) {
            if (i10 <= x0Var.f32282y) {
                x0Var.f32277n = 1;
            } else {
                x0Var.f32277n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f32282y) {
            this.f32208b = 1;
        } else {
            this.f32208b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f32209c;
        x0Var.f32281x = i10;
        x0Var.f32280w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32207a = i10;
        if (i10 == 0) {
            int i11 = this.f32208b;
            x0 x0Var = this.f32209c;
            x0Var.f32277n = i11;
            x0.a(x0Var);
        }
    }
}
