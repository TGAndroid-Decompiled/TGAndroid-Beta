package org.telegram.ui.Components.voip;
public final class u0 implements z4.e {
    public int f32287a = 0;
    public int f32288b;
    public final x0 f32289c;

    public u0(x0 x0Var) {
        this.f32289c = x0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32287a;
        x0 x0Var = this.f32289c;
        if (i11 == 0) {
            if (i10 <= x0Var.f32368y) {
                x0Var.f32363n = 1;
            } else {
                x0Var.f32363n = 2;
            }
            x0.a(x0Var);
        } else if (i10 <= x0Var.f32368y) {
            this.f32288b = 1;
        } else {
            this.f32288b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        x0 x0Var = this.f32289c;
        x0Var.f32367x = i10;
        x0Var.f32366w = f7;
        x0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32287a = i10;
        if (i10 == 0) {
            int i11 = this.f32288b;
            x0 x0Var = this.f32289c;
            x0Var.f32363n = i11;
            x0.a(x0Var);
        }
    }
}
