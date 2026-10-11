package org.telegram.ui.Components;
public final class n7 implements Runnable {
    public final int f29059a;
    public final l8 f29060b;

    public n7(l8 l8Var, int i10) {
        this.f29059a = i10;
        this.f29060b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f29059a) {
            case 0:
                l8.p(this.f29060b);
                return;
            default:
                l8.H(this.f29060b);
                return;
        }
    }
}
