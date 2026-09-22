package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f33224a;
    public final l80 f33225b;

    public e80(l80 l80Var, int i10) {
        this.f33224a = i10;
        this.f33225b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f33224a) {
            case 0:
                l80 l80Var = this.f33225b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f33225b.Y();
                return;
        }
    }
}
