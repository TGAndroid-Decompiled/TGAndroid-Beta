package org.telegram.ui.Components;
public final class n7 implements Runnable {
    public final int f29060a;
    public final l8 f29061b;

    public n7(l8 l8Var, int i10) {
        this.f29060a = i10;
        this.f29061b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f29060a) {
            case 0:
                l8.p(this.f29061b);
                return;
            default:
                l8.H(this.f29061b);
                return;
        }
    }
}
