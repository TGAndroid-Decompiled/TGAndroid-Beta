package org.telegram.ui.Components;
public final class wo0 implements Runnable {
    public final int f40029a;
    public final ys0 f40030b;
    public final int f40031c;

    public wo0(ys0 ys0Var, int i7, int i10) {
        this.f40029a = i10;
        this.f40030b = ys0Var;
        this.f40031c = i7;
    }

    @Override
    public final void run() {
        switch (this.f40029a) {
            case 0:
                this.f40030b.s1(this.f40031c);
                return;
            case 1:
                ys0 ys0Var = this.f40030b;
                ys0Var.a1(ys0Var.f40719x1, ys0Var.l1, this.f40031c);
                return;
            case 2:
                this.f40030b.r1(this.f40031c, false);
                return;
            case 3:
                this.f40030b.s1(this.f40031c);
                return;
            default:
                ys0 ys0Var2 = this.f40030b;
                ys0Var2.b1(ys0Var2.f40719x1, ys0Var2.l1, this.f40031c);
                return;
        }
    }
}
