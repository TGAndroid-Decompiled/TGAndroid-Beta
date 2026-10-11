package org.telegram.ui.Components.voip;
public final class v0 implements z4.e {
    public int f32346a = 0;
    public int f32347b;
    public final y0 f32348c;

    public v0(y0 y0Var) {
        this.f32348c = y0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32346a;
        y0 y0Var = this.f32348c;
        if (i11 == 0) {
            if (i10 <= y0Var.f32427y) {
                y0Var.f32422n = 1;
            } else {
                y0Var.f32422n = 2;
            }
            y0.a(y0Var);
        } else if (i10 <= y0Var.f32427y) {
            this.f32347b = 1;
        } else {
            this.f32347b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        y0 y0Var = this.f32348c;
        y0Var.f32426x = i10;
        y0Var.f32425w = f7;
        y0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32346a = i10;
        if (i10 == 0) {
            int i11 = this.f32347b;
            y0 y0Var = this.f32348c;
            y0Var.f32422n = i11;
            y0.a(y0Var);
        }
    }
}
