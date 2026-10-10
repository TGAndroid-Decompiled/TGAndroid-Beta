package org.telegram.ui.Components;
public final class uc implements Runnable {
    public final int f31448a;
    public final bc f31449b;

    public uc(bc bcVar, int i10) {
        this.f31448a = i10;
        this.f31449b = bcVar;
    }

    @Override
    public final void run() {
        switch (this.f31448a) {
            case 0:
                this.f31449b.performHapticFeedback(3, 2);
                return;
            default:
                this.f31449b.performHapticFeedback(3, 2);
                return;
        }
    }
}
