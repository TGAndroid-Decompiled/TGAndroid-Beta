package org.telegram.ui.Components;
public final class yb implements Runnable {
    public final int f41966a;
    public final fb f41967b;

    public yb(fb fbVar, int i7) {
        this.f41966a = i7;
        this.f41967b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f41966a) {
            case 0:
                this.f41967b.performHapticFeedback(3, 2);
                return;
            default:
                this.f41967b.performHapticFeedback(3, 2);
                return;
        }
    }
}
