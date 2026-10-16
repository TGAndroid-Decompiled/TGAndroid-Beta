package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f29033a;
    public final ac f29034b;

    public tc(ac acVar, int i10) {
        this.f29033a = i10;
        this.f29034b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f29033a) {
            case 0:
                this.f29034b.performHapticFeedback(3, 2);
                return;
            default:
                this.f29034b.performHapticFeedback(3, 2);
                return;
        }
    }
}
