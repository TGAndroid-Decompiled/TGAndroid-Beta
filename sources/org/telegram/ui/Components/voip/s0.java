package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31778a = 0;
    public int f31779b;
    public final v0 f31780c;

    public s0(v0 v0Var) {
        this.f31780c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31780c;
        v0Var.f31890x = i10;
        v0Var.f31889w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31778a;
        v0 v0Var = this.f31780c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31891y) {
                v0Var.f31886n = 1;
            } else {
                v0Var.f31886n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31891y) {
            this.f31779b = 1;
        } else {
            this.f31779b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31778a = i10;
        if (i10 == 0) {
            int i11 = this.f31779b;
            v0 v0Var = this.f31780c;
            v0Var.f31886n = i11;
            v0.a(v0Var);
        }
    }
}
