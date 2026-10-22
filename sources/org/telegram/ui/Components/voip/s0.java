package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31686a = 0;
    public int f31687b;
    public final v0 f31688c;

    public s0(v0 v0Var) {
        this.f31688c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31688c;
        v0Var.f31791x = i10;
        v0Var.f31790w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31686a;
        v0 v0Var = this.f31688c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31792y) {
                v0Var.f31787n = 1;
            } else {
                v0Var.f31787n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31792y) {
            this.f31687b = 1;
        } else {
            this.f31687b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31686a = i10;
        if (i10 == 0) {
            int i11 = this.f31687b;
            v0 v0Var = this.f31688c;
            v0Var.f31787n = i11;
            v0.a(v0Var);
        }
    }
}
