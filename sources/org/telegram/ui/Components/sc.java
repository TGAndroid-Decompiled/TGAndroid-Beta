package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30226a;
    public final yb f30227b;

    public sc(yb ybVar, int i10) {
        this.f30226a = i10;
        this.f30227b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30226a) {
            case 0:
                this.f30227b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30227b.performHapticFeedback(3, 2);
                return;
        }
    }
}
