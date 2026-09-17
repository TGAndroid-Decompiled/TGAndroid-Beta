package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31806a = 0;
    public int f31807b;
    public final v0 f31808c;

    public s0(v0 v0Var) {
        this.f31808c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31808c;
        v0Var.f31918x = i10;
        v0Var.f31917w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31806a;
        v0 v0Var = this.f31808c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31919y) {
                v0Var.f31914n = 1;
            } else {
                v0Var.f31914n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31919y) {
            this.f31807b = 1;
        } else {
            this.f31807b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31806a = i10;
        if (i10 == 0) {
            int i11 = this.f31807b;
            v0 v0Var = this.f31808c;
            v0Var.f31914n = i11;
            v0.a(v0Var);
        }
    }
}
