package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f30852a;
    public final ac f30853b;

    public tc(ac acVar, int i10) {
        this.f30852a = i10;
        this.f30853b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f30852a) {
            case 0:
                this.f30853b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30853b.performHapticFeedback(3, 2);
                return;
        }
    }
}
