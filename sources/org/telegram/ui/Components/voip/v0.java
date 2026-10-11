package org.telegram.ui.Components.voip;
public final class v0 implements z4.e {
    public int f32410a = 0;
    public int f32411b;
    public final y0 f32412c;

    public v0(y0 y0Var) {
        this.f32412c = y0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32410a;
        y0 y0Var = this.f32412c;
        if (i11 == 0) {
            if (i10 <= y0Var.f32491y) {
                y0Var.f32486n = 1;
            } else {
                y0Var.f32486n = 2;
            }
            y0.a(y0Var);
        } else if (i10 <= y0Var.f32491y) {
            this.f32411b = 1;
        } else {
            this.f32411b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        y0 y0Var = this.f32412c;
        y0Var.f32490x = i10;
        y0Var.f32489w = f7;
        y0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32410a = i10;
        if (i10 == 0) {
            int i11 = this.f32411b;
            y0 y0Var = this.f32412c;
            y0Var.f32486n = i11;
            y0.a(y0Var);
        }
    }
}
