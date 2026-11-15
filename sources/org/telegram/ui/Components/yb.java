package org.telegram.ui.Components;
public final class yb implements Runnable {
    public final int f41968a;
    public final fb f41969b;

    public yb(fb fbVar, int i7) {
        this.f41968a = i7;
        this.f41969b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f41968a) {
            case 0:
                this.f41969b.performHapticFeedback(3, 2);
                return;
            default:
                this.f41969b.performHapticFeedback(3, 2);
                return;
        }
    }
}
