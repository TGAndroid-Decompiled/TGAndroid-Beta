package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f29922a;
    public final yb f29923b;

    public rc(yb ybVar, int i10) {
        this.f29922a = i10;
        this.f29923b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f29922a) {
            case 0:
                this.f29923b.performHapticFeedback(3, 2);
                return;
            default:
                this.f29923b.performHapticFeedback(3, 2);
                return;
        }
    }
}
