package org.telegram.ui.Components;
public final class ys implements Runnable {
    public final int f35130a;
    public final ct f35131b;

    public ys(ct ctVar, int i10) {
        this.f35130a = i10;
        this.f35131b = ctVar;
    }

    @Override
    public final void run() {
        switch (this.f35130a) {
            case 0:
                this.f35131b.X(false);
                return;
            default:
                this.f35131b.O(true);
                return;
        }
    }
}
