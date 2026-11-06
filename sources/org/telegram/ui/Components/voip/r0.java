package org.telegram.ui.Components.voip;
public final class r0 implements c5.g {
    public int f39439a = 0;
    public int f39440b;
    public final t0 f39441c;

    public r0(t0 t0Var) {
        this.f39441c = t0Var;
    }

    @Override
    public final void a(int i7) {
        int i10 = this.f39439a;
        t0 t0Var = this.f39441c;
        if (i10 == 0) {
            if (i7 <= t0Var.D) {
                t0Var.f39479n = 1;
            } else {
                t0Var.f39479n = 2;
            }
            t0.a(t0Var);
        } else if (i7 <= t0Var.D) {
            this.f39440b = 1;
        } else {
            this.f39440b = 2;
        }
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        t0 t0Var = this.f39441c;
        t0Var.f39484y = i7;
        t0Var.f39483x = f10;
        t0Var.d();
    }

    @Override
    public final void c(int i7) {
        this.f39439a = i7;
        if (i7 == 0) {
            int i10 = this.f39440b;
            t0 t0Var = this.f39441c;
            t0Var.f39479n = i10;
            t0.a(t0Var);
        }
    }
}
