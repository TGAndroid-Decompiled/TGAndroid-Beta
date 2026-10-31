package org.telegram.ui.Components;
public final class yp0 implements Runnable {
    public final int f32771a;
    public final zt0 f32772b;
    public final int f32773c;

    public yp0(zt0 zt0Var, int i10, int i11) {
        this.f32771a = i11;
        this.f32772b = zt0Var;
        this.f32773c = i10;
    }

    @Override
    public final void run() {
        switch (this.f32771a) {
            case 0:
                this.f32772b.n1(this.f32773c);
                return;
            case 1:
                zt0 zt0Var = this.f32772b;
                zt0Var.V0(zt0Var.f33240x1, zt0Var.l1, this.f32773c);
                return;
            case 2:
                this.f32772b.m1(this.f32773c, false);
                return;
            case 3:
                this.f32772b.n1(this.f32773c);
                return;
            default:
                zt0 zt0Var2 = this.f32772b;
                zt0Var2.W0(zt0Var2.f33240x1, zt0Var2.l1, this.f32773c);
                return;
        }
    }
}
