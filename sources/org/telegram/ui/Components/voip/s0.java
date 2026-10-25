package org.telegram.ui.Components.voip;
public final class s0 implements a5.i {
    public int f34064a = 0;
    public int f34065b;
    public final v0 f34066c;

    public s0(v0 v0Var) {
        this.f34066c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f34064a;
        v0 v0Var = this.f34066c;
        if (i11 == 0) {
            if (i10 <= v0Var.f34146y) {
                v0Var.f34141n = 1;
            } else {
                v0Var.f34141n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f34146y) {
            this.f34065b = 1;
        } else {
            this.f34065b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        v0 v0Var = this.f34066c;
        v0Var.f34145x = i10;
        v0Var.f34144w = f7;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f34064a = i10;
        if (i10 == 0) {
            int i11 = this.f34065b;
            v0 v0Var = this.f34066c;
            v0Var.f34141n = i11;
            v0.a(v0Var);
        }
    }
}
