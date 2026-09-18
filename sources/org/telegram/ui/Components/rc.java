package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27872a;
    public final yb f27873b;

    public rc(yb ybVar, int i10) {
        this.f27872a = i10;
        this.f27873b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27872a) {
            case 0:
                this.f27873b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27873b.performHapticFeedback(3, 2);
                return;
        }
    }
}
