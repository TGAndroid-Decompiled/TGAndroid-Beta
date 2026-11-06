package org.telegram.ui.Components;
public final class wo0 implements Runnable {
    public final int f40046a;
    public final xs0 f40047b;
    public final int f40048c;

    public wo0(xs0 xs0Var, int i7, int i10) {
        this.f40046a = i10;
        this.f40047b = xs0Var;
        this.f40048c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40046a) {
            case 0:
                this.f40047b.q1(this.f40048c);
                return;
            case 1:
                xs0 xs0Var = this.f40047b;
                xs0Var.Y0(xs0Var.f40405x1, xs0Var.l1, this.f40048c);
                return;
            case 2:
                this.f40047b.p1(this.f40048c, false);
                return;
            case 3:
                this.f40047b.q1(this.f40048c);
                return;
            default:
                xs0 xs0Var2 = this.f40047b;
                xs0Var2.Z0(xs0Var2.f40405x1, xs0Var2.l1, this.f40048c);
                return;
        }
    }
}
