package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f32280a = 0;
    public int f32281b;
    public final x0 f32282c;

    public u0(x0 x0Var) {
        this.f32282c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32280a;
        x0 x0Var = this.f32282c;
        if (i11 == 0) {
            if (i10 <= x0Var.f32355y) {
                x0Var.f32350n = 1;
            } else {
                x0Var.f32350n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f32355y) {
            this.f32281b = 1;
        } else {
            this.f32281b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f32282c;
        x0Var.f32354x = i10;
        x0Var.f32353w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32280a = i10;
        if (i10 == 0) {
            int i11 = this.f32281b;
            x0 x0Var = this.f32282c;
            x0Var.f32350n = i11;
            x0.a(x0Var);
        }
    }
}
