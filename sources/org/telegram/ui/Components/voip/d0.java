package org.telegram.ui.Components.voip;
public final class d0 implements b5.h {
    public int f39284a = 0;
    public int f39285b;
    public final f0 f39286c;

    public d0(f0 f0Var) {
        this.f39286c = f0Var;
    }

    @Override
    public final void a(int i3) {
        int i10 = this.f39284a;
        f0 f0Var = this.f39286c;
        if (i10 == 0) {
            if (i3 <= f0Var.E) {
                f0Var.f39330n = 1;
            } else {
                f0Var.f39330n = 2;
            }
            f0.a(f0Var);
        } else if (i3 <= f0Var.E) {
            this.f39285b = 1;
        } else {
            this.f39285b = 2;
        }
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        f0 f0Var = this.f39286c;
        f0Var.f39335y = i3;
        f0Var.f39334x = f10;
        f0Var.d();
    }

    @Override
    public final void c(int i3) {
        this.f39284a = i3;
        if (i3 == 0) {
            int i10 = this.f39285b;
            f0 f0Var = this.f39286c;
            f0Var.f39330n = i10;
            f0.a(f0Var);
        }
    }
}
