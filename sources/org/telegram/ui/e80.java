package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f35999a;
    public final l80 f36000b;

    public e80(l80 l80Var, int i10) {
        this.f35999a = i10;
        this.f36000b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f35999a) {
            case 0:
                l80 l80Var = this.f36000b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f36000b.Y();
                return;
        }
    }
}
