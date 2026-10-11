package org.telegram.ui.Components;
public final class n7 implements Runnable {
    public final int f28987a;
    public final l8 f28988b;

    public n7(l8 l8Var, int i10) {
        this.f28987a = i10;
        this.f28988b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f28987a) {
            case 0:
                l8.p(this.f28988b);
                return;
            default:
                l8.H(this.f28988b);
                return;
        }
    }
}
