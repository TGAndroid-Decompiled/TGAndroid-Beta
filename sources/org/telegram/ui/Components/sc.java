package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30245a;
    public final yb f30246b;

    public sc(yb ybVar, int i10) {
        this.f30245a = i10;
        this.f30246b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30245a) {
            case 0:
                this.f30246b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30246b.performHapticFeedback(3, 2);
                return;
        }
    }
}
