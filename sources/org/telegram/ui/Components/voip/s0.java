package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31731a = 0;
    public int f31732b;
    public final v0 f31733c;

    public s0(v0 v0Var) {
        this.f31733c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31733c;
        v0Var.f31836x = i10;
        v0Var.f31835w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31731a;
        v0 v0Var = this.f31733c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31837y) {
                v0Var.f31832n = 1;
            } else {
                v0Var.f31832n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31837y) {
            this.f31732b = 1;
        } else {
            this.f31732b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31731a = i10;
        if (i10 == 0) {
            int i11 = this.f31732b;
            v0 v0Var = this.f31733c;
            v0Var.f31832n = i11;
            v0.a(v0Var);
        }
    }
}
