package org.telegram.ui.Components;
public final class n7 implements Runnable {
    public final int f28748a;
    public final l8 f28749b;

    public n7(l8 l8Var, int i10) {
        this.f28748a = i10;
        this.f28749b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f28748a) {
            case 0:
                l8.p(this.f28749b);
                return;
            default:
                l8.H(this.f28749b);
                return;
        }
    }
}
