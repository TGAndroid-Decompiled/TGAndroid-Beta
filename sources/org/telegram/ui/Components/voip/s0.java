package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31687a = 0;
    public int f31688b;
    public final v0 f31689c;

    public s0(v0 v0Var) {
        this.f31689c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31689c;
        v0Var.f31792x = i10;
        v0Var.f31791w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31687a;
        v0 v0Var = this.f31689c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31793y) {
                v0Var.f31788n = 1;
            } else {
                v0Var.f31788n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31793y) {
            this.f31688b = 1;
        } else {
            this.f31688b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31687a = i10;
        if (i10 == 0) {
            int i11 = this.f31688b;
            v0 v0Var = this.f31689c;
            v0Var.f31788n = i11;
            v0.a(v0Var);
        }
    }
}
