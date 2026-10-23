package org.telegram.ui.Components.voip;
public final class s0 implements z4.f {
    public int f31868a = 0;
    public int f31869b;
    public final v0 f31870c;

    public s0(v0 v0Var) {
        this.f31870c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f31868a;
        v0 v0Var = this.f31870c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31974y) {
                v0Var.f31969n = 1;
            } else {
                v0Var.f31969n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31974y) {
            this.f31869b = 1;
        } else {
            this.f31869b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        v0 v0Var = this.f31870c;
        v0Var.f31973x = i10;
        v0Var.f31972w = f7;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f31868a = i10;
        if (i10 == 0) {
            int i11 = this.f31869b;
            v0 v0Var = this.f31870c;
            v0Var.f31969n = i11;
            v0.a(v0Var);
        }
    }
}
