package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30248a;
    public final yb f30249b;

    public sc(yb ybVar, int i10) {
        this.f30248a = i10;
        this.f30249b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30248a) {
            case 0:
                this.f30249b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30249b.performHapticFeedback(3, 2);
                return;
        }
    }
}
