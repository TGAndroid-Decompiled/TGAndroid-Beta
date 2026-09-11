package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f35972a;
    public final l80 f35973b;

    public e80(l80 l80Var, int i10) {
        this.f35972a = i10;
        this.f35973b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f35972a) {
            case 0:
                l80 l80Var = this.f35973b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f35973b.Y();
                return;
        }
    }
}
