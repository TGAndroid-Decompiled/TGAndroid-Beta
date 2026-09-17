package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f30009a;
    public final yb f30010b;

    public rc(yb ybVar, int i10) {
        this.f30009a = i10;
        this.f30010b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30009a) {
            case 0:
                this.f30010b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30010b.performHapticFeedback(3, 2);
                return;
        }
    }
}
