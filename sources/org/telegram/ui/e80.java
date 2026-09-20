package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f33283a;
    public final l80 f33284b;

    public e80(l80 l80Var, int i10) {
        this.f33283a = i10;
        this.f33284b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f33283a) {
            case 0:
                l80 l80Var = this.f33284b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f33284b.Y();
                return;
        }
    }
}
