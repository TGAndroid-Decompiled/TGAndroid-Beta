package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f30008a;
    public final yb f30009b;

    public rc(yb ybVar, int i10) {
        this.f30008a = i10;
        this.f30009b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30008a) {
            case 0:
                this.f30009b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30009b.performHapticFeedback(3, 2);
                return;
        }
    }
}
