package org.telegram.ui;
public final class m70 implements Runnable {
    public final int f39020a;
    public final t70 f39021b;

    public m70(t70 t70Var, int i10) {
        this.f39020a = i10;
        this.f39021b = t70Var;
    }

    @Override
    public final void run() {
        switch (this.f39020a) {
            case 0:
                t70 t70Var = this.f39021b;
                t70Var.h.postOnAnimation(new m70(t70Var, 1));
                return;
            default:
                this.f39021b.Y();
                return;
        }
    }
}
