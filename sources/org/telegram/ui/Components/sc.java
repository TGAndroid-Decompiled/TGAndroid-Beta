package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30234a;
    public final yb f30235b;

    public sc(yb ybVar, int i10) {
        this.f30234a = i10;
        this.f30235b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30234a) {
            case 0:
                this.f30235b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30235b.performHapticFeedback(3, 2);
                return;
        }
    }
}
