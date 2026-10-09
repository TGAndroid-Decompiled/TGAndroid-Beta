package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f37191a;
    public final l80 f37192b;

    public e80(l80 l80Var, int i10) {
        this.f37191a = i10;
        this.f37192b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f37191a) {
            case 0:
                l80 l80Var = this.f37192b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f37192b.Y();
                return;
        }
    }
}
