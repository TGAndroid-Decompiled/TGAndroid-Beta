package org.telegram.ui.Components;
public final class wo0 implements Runnable {
    public final int f40061a;
    public final xs0 f40062b;
    public final int f40063c;

    public wo0(xs0 xs0Var, int i7, int i10) {
        this.f40061a = i10;
        this.f40062b = xs0Var;
        this.f40063c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40061a) {
            case 0:
                this.f40062b.q1(this.f40063c);
                return;
            case 1:
                xs0 xs0Var = this.f40062b;
                xs0Var.Y0(xs0Var.f40440x1, xs0Var.l1, this.f40063c);
                return;
            case 2:
                this.f40062b.p1(this.f40063c, false);
                return;
            case 3:
                this.f40062b.q1(this.f40063c);
                return;
            default:
                xs0 xs0Var2 = this.f40062b;
                xs0Var2.Z0(xs0Var2.f40440x1, xs0Var2.l1, this.f40063c);
                return;
        }
    }
}
