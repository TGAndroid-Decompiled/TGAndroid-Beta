package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31729a = 0;
    public int f31730b;
    public final v0 f31731c;

    public s0(v0 v0Var) {
        this.f31731c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31731c;
        v0Var.f31834x = i10;
        v0Var.f31833w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31729a;
        v0 v0Var = this.f31731c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31835y) {
                v0Var.f31830n = 1;
            } else {
                v0Var.f31830n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31835y) {
            this.f31730b = 1;
        } else {
            this.f31730b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31729a = i10;
        if (i10 == 0) {
            int i11 = this.f31730b;
            v0 v0Var = this.f31731c;
            v0Var.f31830n = i11;
            v0.a(v0Var);
        }
    }
}
