package org.telegram.ui.Components.voip;
public final class v0 implements z4.e {
    public int f32032a = 0;
    public int f32033b;
    public final y0 f32034c;

    public v0(y0 y0Var) {
        this.f32034c = y0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32032a;
        y0 y0Var = this.f32034c;
        if (i11 == 0) {
            if (i10 <= y0Var.f32113y) {
                y0Var.f32108n = 1;
            } else {
                y0Var.f32108n = 2;
            }
            y0.a(y0Var);
        } else if (i10 <= y0Var.f32113y) {
            this.f32033b = 1;
        } else {
            this.f32033b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        y0 y0Var = this.f32034c;
        y0Var.f32112x = i10;
        y0Var.f32111w = f7;
        y0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32032a = i10;
        if (i10 == 0) {
            int i11 = this.f32033b;
            y0 y0Var = this.f32034c;
            y0Var.f32108n = i11;
            y0.a(y0Var);
        }
    }
}
