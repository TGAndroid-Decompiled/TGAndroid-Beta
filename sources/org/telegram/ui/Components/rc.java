package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27940a;
    public final yb f27941b;

    public rc(yb ybVar, int i10) {
        this.f27940a = i10;
        this.f27941b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27940a) {
            case 0:
                this.f27941b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27941b.performHapticFeedback(3, 2);
                return;
        }
    }
}
