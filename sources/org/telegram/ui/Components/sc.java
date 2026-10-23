package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30249a;
    public final yb f30250b;

    public sc(yb ybVar, int i10) {
        this.f30249a = i10;
        this.f30250b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30249a) {
            case 0:
                this.f30250b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30250b.performHapticFeedback(3, 2);
                return;
        }
    }
}
