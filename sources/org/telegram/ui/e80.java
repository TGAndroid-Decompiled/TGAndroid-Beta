package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f36000a;
    public final l80 f36001b;

    public e80(l80 l80Var, int i10) {
        this.f36000a = i10;
        this.f36001b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f36000a) {
            case 0:
                l80 l80Var = this.f36001b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f36001b.Y();
                return;
        }
    }
}
