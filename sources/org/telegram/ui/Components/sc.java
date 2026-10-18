package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30241a;
    public final yb f30242b;

    public sc(yb ybVar, int i10) {
        this.f30241a = i10;
        this.f30242b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30241a) {
            case 0:
                this.f30242b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30242b.performHapticFeedback(3, 2);
                return;
        }
    }
}
