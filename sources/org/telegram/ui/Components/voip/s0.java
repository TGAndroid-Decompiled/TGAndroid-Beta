package org.telegram.ui.Components.voip;
public final class s0 implements a5.i {
    public int f34172a = 0;
    public int f34173b;
    public final v0 f34174c;

    public s0(v0 v0Var) {
        this.f34174c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f34172a;
        v0 v0Var = this.f34174c;
        if (i11 == 0) {
            if (i10 <= v0Var.f34254y) {
                v0Var.f34249n = 1;
            } else {
                v0Var.f34249n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f34254y) {
            this.f34173b = 1;
        } else {
            this.f34173b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        v0 v0Var = this.f34174c;
        v0Var.f34253x = i10;
        v0Var.f34252w = f7;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f34172a = i10;
        if (i10 == 0) {
            int i11 = this.f34173b;
            v0 v0Var = this.f34174c;
            v0Var.f34249n = i11;
            v0.a(v0Var);
        }
    }
}
