package org.telegram.ui.Components.voip;
public final class r0 implements m2.f {
    public int f29875a = 0;
    public int f29876b;
    public final u0 f29877c;

    public r0(u0 u0Var) {
        this.f29877c = u0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29875a;
        u0 u0Var = this.f29877c;
        if (i11 == 0) {
            if (i10 <= u0Var.f29974y) {
                u0Var.f29969n = 1;
            } else {
                u0Var.f29969n = 2;
            }
            u0.a(u0Var);
        } else if (i10 <= u0Var.f29974y) {
            this.f29876b = 1;
        } else {
            this.f29876b = 2;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        u0 u0Var = this.f29877c;
        u0Var.f29973x = i10;
        u0Var.f29972w = f10;
        u0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29875a = i10;
        if (i10 == 0) {
            int i11 = this.f29876b;
            u0 u0Var = this.f29877c;
            u0Var.f29969n = i11;
            u0.a(u0Var);
        }
    }
}
