package org.telegram.ui.Components;
public final class n7 implements Runnable {
    public final int f28737a;
    public final l8 f28738b;

    public n7(l8 l8Var, int i10) {
        this.f28737a = i10;
        this.f28738b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f28737a) {
            case 0:
                l8.p(this.f28738b);
                return;
            default:
                l8.H(this.f28738b);
                return;
        }
    }
}
