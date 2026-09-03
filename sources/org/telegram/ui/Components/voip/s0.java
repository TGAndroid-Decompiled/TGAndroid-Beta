package org.telegram.ui.Components.voip;
public final class s0 implements m2.f {
    public int f32318a = 0;
    public int f32319b;
    public final v0 f32320c;

    public s0(v0 v0Var) {
        this.f32320c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32318a;
        v0 v0Var = this.f32320c;
        if (i11 == 0) {
            if (i10 <= v0Var.f32423y) {
                v0Var.f32418n = 1;
            } else {
                v0Var.f32418n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f32423y) {
            this.f32319b = 1;
        } else {
            this.f32319b = 2;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        v0 v0Var = this.f32320c;
        v0Var.f32422x = i10;
        v0Var.f32421w = f10;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32318a = i10;
        if (i10 == 0) {
            int i11 = this.f32319b;
            v0 v0Var = this.f32320c;
            v0Var.f32418n = i11;
            v0.a(v0Var);
        }
    }
}
