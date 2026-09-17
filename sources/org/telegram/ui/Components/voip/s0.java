package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31779a = 0;
    public int f31780b;
    public final v0 f31781c;

    public s0(v0 v0Var) {
        this.f31781c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31781c;
        v0Var.f31891x = i10;
        v0Var.f31890w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31779a;
        v0 v0Var = this.f31781c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31892y) {
                v0Var.f31887n = 1;
            } else {
                v0Var.f31887n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31892y) {
            this.f31780b = 1;
        } else {
            this.f31780b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31779a = i10;
        if (i10 == 0) {
            int i11 = this.f31780b;
            v0 v0Var = this.f31781c;
            v0Var.f31887n = i11;
            v0.a(v0Var);
        }
    }
}
