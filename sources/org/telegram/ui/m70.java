package org.telegram.ui;

public final class m70 implements Runnable {

    public final int f40385a;

    public final t70 f40386b;

    public m70(t70 t70Var, int i10) {
        this.f40385a = i10;
        this.f40386b = t70Var;
    }

    @Override
    public final void run() {
        switch (this.f40385a) {
            case 0:
                t70 t70Var = this.f40386b;
                t70Var.h.postOnAnimation(new m70(t70Var, 1));
                break;
            default:
                this.f40386b.Y();
                break;
        }
    }
}
