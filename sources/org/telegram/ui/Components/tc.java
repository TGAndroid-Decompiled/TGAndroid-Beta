package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f31202a;
    public final ac f31203b;

    public tc(ac acVar, int i10) {
        this.f31202a = i10;
        this.f31203b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f31202a) {
            case 0:
                this.f31203b.performHapticFeedback(3, 2);
                return;
            default:
                this.f31203b.performHapticFeedback(3, 2);
                return;
        }
    }
}
