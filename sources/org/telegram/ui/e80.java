package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f37193a;
    public final l80 f37194b;

    public e80(l80 l80Var, int i10) {
        this.f37193a = i10;
        this.f37194b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f37193a) {
            case 0:
                l80 l80Var = this.f37194b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f37194b.Y();
                return;
        }
    }
}
