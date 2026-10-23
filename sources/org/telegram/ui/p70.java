package org.telegram.ui;
public final class p70 implements Runnable {
    public final int f40388a;
    public final x70 f40389b;

    public p70(x70 x70Var, int i10) {
        this.f40388a = i10;
        this.f40389b = x70Var;
    }

    @Override
    public final void run() {
        switch (this.f40388a) {
            case 0:
                x70 x70Var = this.f40389b;
                x70Var.h.postOnAnimation(new p70(x70Var, 1));
                return;
            default:
                this.f40389b.Y();
                return;
        }
    }
}
