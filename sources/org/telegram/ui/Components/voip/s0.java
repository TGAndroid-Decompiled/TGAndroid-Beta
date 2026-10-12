package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f30446a = 0;
    public int f30447b;
    public final v0 f30448c;

    public s0(v0 v0Var) {
        this.f30448c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f30448c;
        v0Var.f30552x = i10;
        v0Var.f30551w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f30446a;
        v0 v0Var = this.f30448c;
        if (i11 == 0) {
            if (i10 <= v0Var.f30553y) {
                v0Var.f30548n = 1;
            } else {
                v0Var.f30548n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f30553y) {
            this.f30447b = 1;
        } else {
            this.f30447b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f30446a = i10;
        if (i10 == 0) {
            int i11 = this.f30447b;
            v0 v0Var = this.f30448c;
            v0Var.f30548n = i11;
            v0.a(v0Var);
        }
    }
}
