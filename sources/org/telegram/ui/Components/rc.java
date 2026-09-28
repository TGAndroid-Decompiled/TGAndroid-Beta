package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27936a;
    public final yb f27937b;

    public rc(yb ybVar, int i10) {
        this.f27936a = i10;
        this.f27937b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27936a) {
            case 0:
                this.f27937b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27937b.performHapticFeedback(3, 2);
                return;
        }
    }
}
