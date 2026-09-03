package org.telegram.ui.Components.voip;
public final class r0 implements m2.f {
    public int f29847a = 0;
    public int f29848b;
    public final u0 f29849c;

    public r0(u0 u0Var) {
        this.f29849c = u0Var;
    }

    @Override
    public final void a(int i10) {
        int i11 = this.f29847a;
        u0 u0Var = this.f29849c;
        if (i11 == 0) {
            if (i10 <= u0Var.f29946y) {
                u0Var.f29941n = 1;
            } else {
                u0Var.f29941n = 2;
            }
            u0.a(u0Var);
        } else if (i10 <= u0Var.f29946y) {
            this.f29848b = 1;
        } else {
            this.f29848b = 2;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        u0 u0Var = this.f29849c;
        u0Var.f29945x = i10;
        u0Var.f29944w = f10;
        u0Var.d();
    }

    @Override
    public final void c(int i10) {
        this.f29847a = i10;
        if (i10 == 0) {
            int i11 = this.f29848b;
            u0 u0Var = this.f29849c;
            u0Var.f29941n = i11;
            u0.a(u0Var);
        }
    }
}
