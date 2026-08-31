package org.telegram.ui.Components.voip;
public final class s0 implements m2.f {
    public int f32313a = 0;
    public int f32314b;
    public final v0 f32315c;

    public s0(v0 v0Var) {
        this.f32315c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f32313a;
        v0 v0Var = this.f32315c;
        if (i11 == 0) {
            if (i10 <= v0Var.f32418y) {
                v0Var.f32413n = 1;
            } else {
                v0Var.f32413n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f32418y) {
            this.f32314b = 1;
        } else {
            this.f32314b = 2;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        v0 v0Var = this.f32315c;
        v0Var.f32417x = i10;
        v0Var.f32416w = f10;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f32313a = i10;
        if (i10 == 0) {
            int i11 = this.f32314b;
            v0 v0Var = this.f32315c;
            v0Var.f32413n = i11;
            v0.a(v0Var);
        }
    }
}
