package org.telegram.ui;
public final class m70 implements Runnable {
    public final int f39045a;
    public final t70 f39046b;

    public m70(t70 t70Var, int i10) {
        this.f39045a = i10;
        this.f39046b = t70Var;
    }

    @Override
    public final void run() {
        switch (this.f39045a) {
            case 0:
                t70 t70Var = this.f39046b;
                t70Var.h.postOnAnimation(new m70(t70Var, 1));
                return;
            default:
                this.f39046b.Y();
                return;
        }
    }
}
