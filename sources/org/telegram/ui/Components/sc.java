package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30244a;
    public final yb f30245b;

    public sc(yb ybVar, int i10) {
        this.f30244a = i10;
        this.f30245b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30244a) {
            case 0:
                this.f30245b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30245b.performHapticFeedback(3, 2);
                return;
        }
    }
}
