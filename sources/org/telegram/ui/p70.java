package org.telegram.ui;
public final class p70 implements Runnable {
    public final int f40381a;
    public final x70 f40382b;

    public p70(x70 x70Var, int i10) {
        this.f40381a = i10;
        this.f40382b = x70Var;
    }

    @Override
    public final void run() {
        switch (this.f40381a) {
            case 0:
                x70 x70Var = this.f40382b;
                x70Var.h.postOnAnimation(new p70(x70Var, 1));
                return;
            default:
                this.f40382b.Y();
                return;
        }
    }
}
