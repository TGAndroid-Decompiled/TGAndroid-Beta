package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f29915a;
    public final yb f29916b;

    public rc(yb ybVar, int i10) {
        this.f29915a = i10;
        this.f29916b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f29915a) {
            case 0:
                this.f29916b.performHapticFeedback(3, 2);
                return;
            default:
                this.f29916b.performHapticFeedback(3, 2);
                return;
        }
    }
}
