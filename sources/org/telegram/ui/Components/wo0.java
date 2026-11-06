package org.telegram.ui.Components;
public final class wo0 implements Runnable {
    public final int f40053a;
    public final xs0 f40054b;
    public final int f40055c;

    public wo0(xs0 xs0Var, int i7, int i10) {
        this.f40053a = i10;
        this.f40054b = xs0Var;
        this.f40055c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40053a) {
            case 0:
                this.f40054b.q1(this.f40055c);
                return;
            case 1:
                xs0 xs0Var = this.f40054b;
                xs0Var.Y0(xs0Var.f40424x1, xs0Var.l1, this.f40055c);
                return;
            case 2:
                this.f40054b.p1(this.f40055c, false);
                return;
            case 3:
                this.f40054b.q1(this.f40055c);
                return;
            default:
                xs0 xs0Var2 = this.f40054b;
                xs0Var2.Z0(xs0Var2.f40424x1, xs0Var2.l1, this.f40055c);
                return;
        }
    }
}
