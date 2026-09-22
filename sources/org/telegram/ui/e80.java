package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f33303a;
    public final l80 f33304b;

    public e80(l80 l80Var, int i10) {
        this.f33303a = i10;
        this.f33304b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f33303a) {
            case 0:
                l80 l80Var = this.f33304b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f33304b.Y();
                return;
        }
    }
}
