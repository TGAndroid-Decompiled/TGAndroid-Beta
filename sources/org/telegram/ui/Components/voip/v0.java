package org.telegram.ui.Components.voip;
public final class v0 implements z4.e {
    public int f32046a = 0;
    public int f32047b;
    public final y0 f32048c;

    public v0(y0 y0Var) {
        this.f32048c = y0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32046a;
        y0 y0Var = this.f32048c;
        if (i11 == 0) {
            if (i10 <= y0Var.f32128y) {
                y0Var.f32123n = 1;
            } else {
                y0Var.f32123n = 2;
            }
            y0.a(y0Var);
        } else if (i10 <= y0Var.f32128y) {
            this.f32047b = 1;
        } else {
            this.f32047b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        y0 y0Var = this.f32048c;
        y0Var.f32127x = i10;
        y0Var.f32126w = f7;
        y0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32046a = i10;
        if (i10 == 0) {
            int i11 = this.f32047b;
            y0 y0Var = this.f32048c;
            y0Var.f32123n = i11;
            y0.a(y0Var);
        }
    }
}
