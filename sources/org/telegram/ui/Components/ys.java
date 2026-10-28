package org.telegram.ui.Components;
public final class ys implements Runnable {
    public final int f35157a;
    public final ct f35158b;

    public ys(ct ctVar, int i10) {
        this.f35157a = i10;
        this.f35158b = ctVar;
    }

    @Override
    public final void run() {
        switch (this.f35157a) {
            case 0:
                this.f35158b.X(false);
                return;
            default:
                this.f35158b.O(true);
                return;
        }
    }
}
