package org.telegram.ui.Components.voip;
public final class r0 implements m2.e {
    public int f33769a = 0;
    public int f33770b;
    public final u0 f33771c;

    public r0(u0 u0Var) {
        this.f33771c = u0Var;
    }

    @Override
    public final void b(int i9) {
        int i10 = this.f33769a;
        u0 u0Var = this.f33771c;
        if (i10 == 0) {
            if (i9 <= u0Var.f33873y) {
                u0Var.f33868n = 1;
            } else {
                u0Var.f33868n = 2;
            }
            u0.a(u0Var);
        } else if (i9 <= u0Var.f33873y) {
            this.f33770b = 1;
        } else {
            this.f33770b = 2;
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        u0 u0Var = this.f33771c;
        u0Var.f33872x = i9;
        u0Var.f33871w = f10;
        u0Var.d();
    }

    @Override
    public final void d(int i9) {
        this.f33769a = i9;
        if (i9 == 0) {
            int i10 = this.f33770b;
            u0 u0Var = this.f33771c;
            u0Var.f33868n = i10;
            u0.a(u0Var);
        }
    }
}
