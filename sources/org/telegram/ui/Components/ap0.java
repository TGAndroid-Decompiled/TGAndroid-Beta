package org.telegram.ui.Components;
public final class ap0 implements Runnable {
    public final int f33035a;
    public final ys0 f33036b;
    public final int f33037c;

    public ap0(ys0 ys0Var, int i7, int i10) {
        this.f33035a = i10;
        this.f33036b = ys0Var;
        this.f33037c = i7;
    }

    @Override
    public final void run() {
        switch (this.f33035a) {
            case 0:
                this.f33036b.s1(this.f33037c);
                return;
            case 1:
                ys0 ys0Var = this.f33036b;
                ys0Var.a1(ys0Var.f42150y1, ys0Var.f42114m1, this.f33037c);
                return;
            case 2:
                this.f33036b.r1(this.f33037c, false);
                return;
            case 3:
                this.f33036b.s1(this.f33037c);
                return;
            default:
                ys0 ys0Var2 = this.f33036b;
                ys0Var2.b1(ys0Var2.f42150y1, ys0Var2.f42114m1, this.f33037c);
                return;
        }
    }
}
