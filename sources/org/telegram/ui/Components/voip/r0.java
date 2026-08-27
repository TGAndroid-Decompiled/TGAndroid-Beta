package org.telegram.ui.Components.voip;

public final class r0 implements m2.e {

    public int f33819a = 0;

    public int f33820b;

    public final u0 f33821c;

    public r0(u0 u0Var) {
        this.f33821c = u0Var;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f33819a;
        u0 u0Var = this.f33821c;
        if (i11 == 0) {
            if (i10 <= u0Var.f33923y) {
                u0Var.f33918n = 1;
            } else {
                u0Var.f33918n = 2;
            }
            u0.a(u0Var);
            return;
        }
        if (i10 <= u0Var.f33923y) {
            this.f33820b = 1;
        } else {
            this.f33820b = 2;
        }
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        u0 u0Var = this.f33821c;
        u0Var.f33922x = i10;
        u0Var.f33921w = f10;
        u0Var.d();
    }

    @Override
    public final void d(int i10) {
        this.f33819a = i10;
        if (i10 == 0) {
            int i11 = this.f33820b;
            u0 u0Var = this.f33821c;
            u0Var.f33918n = i11;
            u0.a(u0Var);
        }
    }
}
