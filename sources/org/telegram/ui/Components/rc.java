package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27600a;
    public final yb f27601b;

    public rc(yb ybVar, int i10) {
        this.f27600a = i10;
        this.f27601b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27600a) {
            case 0:
                this.f27601b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27601b.performHapticFeedback(3, 2);
                return;
        }
    }
}
