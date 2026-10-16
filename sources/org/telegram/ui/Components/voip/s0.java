package org.telegram.ui.Components.voip;
public final class s0 implements z4.e {
    public int f30115a = 0;
    public int f30116b;
    public final v0 f30117c;

    public s0(v0 v0Var) {
        this.f30117c = v0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        v0 v0Var = this.f30117c;
        v0Var.f30221x = i10;
        v0Var.f30220w = f7;
        v0Var.d();
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f30115a;
        v0 v0Var = this.f30117c;
        if (i11 == 0) {
            if (i10 <= v0Var.f30222y) {
                v0Var.f30217n = 1;
            } else {
                v0Var.f30217n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f30222y) {
            this.f30116b = 1;
        } else {
            this.f30116b = 2;
        }
    }

    @Override
    public final void c(int i10) {
        this.f30115a = i10;
        if (i10 == 0) {
            int i11 = this.f30116b;
            v0 v0Var = this.f30117c;
            v0Var.f30217n = i11;
            v0.a(v0Var);
        }
    }
}
