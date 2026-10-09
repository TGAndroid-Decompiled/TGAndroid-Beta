package org.telegram.ui.Components;
public final class uc implements Runnable {
    public final int f31431a;
    public final bc f31432b;

    public uc(bc bcVar, int i10) {
        this.f31431a = i10;
        this.f31432b = bcVar;
    }

    @Override
    public final void run() {
        switch (this.f31431a) {
            case 0:
                this.f31432b.performHapticFeedback(3, 2);
                return;
            default:
                this.f31432b.performHapticFeedback(3, 2);
                return;
        }
    }
}
