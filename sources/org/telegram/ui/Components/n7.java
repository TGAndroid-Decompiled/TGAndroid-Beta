package org.telegram.ui.Components;
public final class n7 implements Runnable {
    public final int f29019a;
    public final l8 f29020b;

    public n7(l8 l8Var, int i10) {
        this.f29019a = i10;
        this.f29020b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f29019a) {
            case 0:
                l8.p(this.f29020b);
                return;
            default:
                l8.H(this.f29020b);
                return;
        }
    }
}
