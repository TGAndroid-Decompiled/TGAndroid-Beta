package org.telegram.ui.Components.voip;
public final class s0 implements z4.f {
    public int f31838a = 0;
    public int f31839b;
    public final v0 f31840c;

    public s0(v0 v0Var) {
        this.f31840c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f31838a;
        v0 v0Var = this.f31840c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31944y) {
                v0Var.f31939n = 1;
            } else {
                v0Var.f31939n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31944y) {
            this.f31839b = 1;
        } else {
            this.f31839b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        v0 v0Var = this.f31840c;
        v0Var.f31943x = i10;
        v0Var.f31942w = f7;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f31838a = i10;
        if (i10 == 0) {
            int i11 = this.f31839b;
            v0 v0Var = this.f31840c;
            v0Var.f31939n = i11;
            v0.a(v0Var);
        }
    }
}
