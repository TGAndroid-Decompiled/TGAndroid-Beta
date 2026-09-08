package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f30035a;
    public final yb f30036b;

    public rc(yb ybVar, int i10) {
        this.f30035a = i10;
        this.f30036b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f30035a) {
            case 0:
                this.f30036b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30036b.performHapticFeedback(3, 2);
                return;
        }
    }
}
