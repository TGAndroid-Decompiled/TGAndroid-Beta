package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f33270a;
    public final l80 f33271b;

    public e80(l80 l80Var, int i10) {
        this.f33270a = i10;
        this.f33271b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f33270a) {
            case 0:
                l80 l80Var = this.f33271b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f33271b.Y();
                return;
        }
    }
}
