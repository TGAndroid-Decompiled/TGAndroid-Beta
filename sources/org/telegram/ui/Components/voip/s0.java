package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31722a = 0;
    public int f31723b;
    public final v0 f31724c;

    public s0(v0 v0Var) {
        this.f31724c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31724c;
        v0Var.f31827x = i10;
        v0Var.f31826w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31722a;
        v0 v0Var = this.f31724c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31828y) {
                v0Var.f31823n = 1;
            } else {
                v0Var.f31823n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31828y) {
            this.f31723b = 1;
        } else {
            this.f31723b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31722a = i10;
        if (i10 == 0) {
            int i11 = this.f31723b;
            v0 v0Var = this.f31724c;
            v0Var.f31823n = i11;
            v0.a(v0Var);
        }
    }
}
