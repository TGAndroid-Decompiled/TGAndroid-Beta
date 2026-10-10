package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f37237a;
    public final l80 f37238b;

    public e80(l80 l80Var, int i10) {
        this.f37237a = i10;
        this.f37238b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f37237a) {
            case 0:
                l80 l80Var = this.f37238b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f37238b.Y();
                return;
        }
    }
}
