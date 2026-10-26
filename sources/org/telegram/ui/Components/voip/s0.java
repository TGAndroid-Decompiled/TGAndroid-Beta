package org.telegram.ui.Components.voip;
public final class s0 implements a5.i {
    public int f34067a = 0;
    public int f34068b;
    public final v0 f34069c;

    public s0(v0 v0Var) {
        this.f34069c = v0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f34067a;
        v0 v0Var = this.f34069c;
        if (i11 == 0) {
            if (i10 <= v0Var.f34149y) {
                v0Var.f34144n = 1;
            } else {
                v0Var.f34144n = 2;
            }
            v0.a(v0Var);
        } else if (i10 <= v0Var.f34149y) {
            this.f34068b = 1;
        } else {
            this.f34068b = 2;
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        v0 v0Var = this.f34069c;
        v0Var.f34148x = i10;
        v0Var.f34147w = f7;
        v0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f34067a = i10;
        if (i10 == 0) {
            int i11 = this.f34068b;
            v0 v0Var = this.f34069c;
            v0Var.f34144n = i11;
            v0.a(v0Var);
        }
    }
}
