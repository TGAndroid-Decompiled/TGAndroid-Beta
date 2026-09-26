package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27887a;
    public final yb f27888b;

    public rc(yb ybVar, int i10) {
        this.f27887a = i10;
        this.f27888b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27887a) {
            case 0:
                this.f27888b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27888b.performHapticFeedback(3, 2);
                return;
        }
    }
}
