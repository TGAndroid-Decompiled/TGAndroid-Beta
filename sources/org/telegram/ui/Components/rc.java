package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27939a;
    public final yb f27940b;

    public rc(yb ybVar, int i10) {
        this.f27939a = i10;
        this.f27940b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27939a) {
            case 0:
                this.f27940b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27940b.performHapticFeedback(3, 2);
                return;
        }
    }
}
