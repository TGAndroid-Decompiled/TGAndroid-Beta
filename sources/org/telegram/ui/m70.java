package org.telegram.ui;
public final class m70 implements Runnable {
    public final int f39001a;
    public final t70 f39002b;

    public m70(t70 t70Var, int i10) {
        this.f39001a = i10;
        this.f39002b = t70Var;
    }

    @Override
    public final void run() {
        switch (this.f39001a) {
            case 0:
                t70 t70Var = this.f39002b;
                t70Var.h.postOnAnimation(new m70(t70Var, 1));
                return;
            default:
                this.f39002b.Y();
                return;
        }
    }
}
