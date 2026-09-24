package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27931a;
    public final yb f27932b;

    public rc(yb ybVar, int i10) {
        this.f27931a = i10;
        this.f27932b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27931a) {
            case 0:
                this.f27932b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27932b.performHapticFeedback(3, 2);
                return;
        }
    }
}
