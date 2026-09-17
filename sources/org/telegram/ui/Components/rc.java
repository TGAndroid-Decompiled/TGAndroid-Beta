package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f30036a;
    public final yb f30037b;

    public rc(yb ybVar, int i10) {
        this.f30036a = i10;
        this.f30037b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30036a) {
            case 0:
                this.f30037b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30037b.performHapticFeedback(3, 2);
                return;
        }
    }
}
