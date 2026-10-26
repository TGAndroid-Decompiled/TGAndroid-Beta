package org.telegram.ui.Components;
public final class ys implements Runnable {
    public final int f35133a;
    public final ct f35134b;

    public ys(ct ctVar, int i10) {
        this.f35133a = i10;
        this.f35134b = ctVar;
    }

    @Override
    public final void run() {
        switch (this.f35133a) {
            case 0:
                this.f35134b.X(false);
                return;
            default:
                this.f35134b.O(true);
                return;
        }
    }
}
