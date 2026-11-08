package org.telegram.ui.Components;
public final class wo0 implements Runnable {
    public final int f40011a;
    public final xs0 f40012b;
    public final int f40013c;

    public wo0(xs0 xs0Var, int i7, int i10) {
        this.f40011a = i10;
        this.f40012b = xs0Var;
        this.f40013c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40011a) {
            case 0:
                this.f40012b.q1(this.f40013c);
                return;
            case 1:
                xs0 xs0Var = this.f40012b;
                xs0Var.Y0(xs0Var.f40461x1, xs0Var.l1, this.f40013c);
                return;
            case 2:
                this.f40012b.p1(this.f40013c, false);
                return;
            case 3:
                this.f40012b.q1(this.f40013c);
                return;
            default:
                xs0 xs0Var2 = this.f40012b;
                xs0Var2.Z0(xs0Var2.f40461x1, xs0Var2.l1, this.f40013c);
                return;
        }
    }
}
