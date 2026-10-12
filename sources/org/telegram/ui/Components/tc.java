package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f29346a;
    public final ac f29347b;

    public tc(ac acVar, int i10) {
        this.f29346a = i10;
        this.f29347b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f29346a) {
            case 0:
                this.f29347b.performHapticFeedback(3, 2);
                return;
            default:
                this.f29347b.performHapticFeedback(3, 2);
                return;
        }
    }
}
