package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f31683a = 0;
    public int f31684b;
    public final v0 f31685c;

    public s0(v0 v0Var) {
        this.f31685c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f31685c;
        v0Var.f31788x = i10;
        v0Var.f31787w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f31683a;
        v0 v0Var = this.f31685c;
        if (i11 == 0) {
            if (i10 <= v0Var.f31789y) {
                v0Var.f31784n = 1;
            } else {
                v0Var.f31784n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f31789y) {
            this.f31684b = 1;
        } else {
            this.f31684b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f31683a = i10;
        if (i10 == 0) {
            int i11 = this.f31684b;
            v0 v0Var = this.f31685c;
            v0Var.f31784n = i11;
            v0.a(v0Var);
        }
    }
}
