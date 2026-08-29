package org.telegram.ui.Components.voip;
public final class s0 implements m2.e {
    public int f33977a = 0;
    public int f33978b;
    public final v0 f33979c;

    public s0(v0 v0Var) {
        this.f33979c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f33977a;
        v0 v0Var = this.f33979c;
        if (i11 == 0) {
            if (i10 <= v0Var.f34077y) {
                v0Var.f34072n = 1;
            } else {
                v0Var.f34072n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f34077y) {
            this.f33978b = 1;
        } else {
            this.f33978b = 2;
        }
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        v0 v0Var = this.f33979c;
        v0Var.f34076x = i10;
        v0Var.f34075w = f9;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f33977a = i10;
        if (i10 == 0) {
            int i11 = this.f33978b;
            v0 v0Var = this.f33979c;
            v0Var.f34072n = i11;
            v0.a(v0Var);
        }
    }
}
