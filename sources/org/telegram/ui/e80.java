package org.telegram.ui;
public final class e80 implements Runnable {
    public final int f35973a;
    public final l80 f35974b;

    public e80(l80 l80Var, int i10) {
        this.f35973a = i10;
        this.f35974b = l80Var;
    }

    @Override
    public final void run() {
        switch (this.f35973a) {
            case 0:
                l80 l80Var = this.f35974b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                return;
            default:
                this.f35974b.Y();
                return;
        }
    }
}
