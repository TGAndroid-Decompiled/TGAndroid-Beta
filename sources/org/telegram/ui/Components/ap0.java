package org.telegram.ui.Components;
public final class ap0 implements Runnable {
    public final int f33038a;
    public final ys0 f33039b;
    public final int f33040c;

    public ap0(ys0 ys0Var, int i7, int i10) {
        this.f33038a = i10;
        this.f33039b = ys0Var;
        this.f33040c = i7;
    }

    @Override
    public final void run() {
        switch (this.f33038a) {
            case 0:
                this.f33039b.s1(this.f33040c);
                return;
            case 1:
                ys0 ys0Var = this.f33039b;
                ys0Var.a1(ys0Var.f42152y1, ys0Var.f42116m1, this.f33040c);
                return;
            case 2:
                this.f33039b.r1(this.f33040c, false);
                return;
            case 3:
                this.f33039b.s1(this.f33040c);
                return;
            default:
                ys0 ys0Var2 = this.f33039b;
                ys0Var2.b1(ys0Var2.f42152y1, ys0Var2.f42116m1, this.f33040c);
                return;
        }
    }
}
