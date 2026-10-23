package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30454a;
    public final yb f30455b;

    public sc(yb ybVar, int i10) {
        this.f30454a = i10;
        this.f30455b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30454a) {
            case 0:
                this.f30455b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30455b.performHapticFeedback(3, 2);
                return;
        }
    }
}
