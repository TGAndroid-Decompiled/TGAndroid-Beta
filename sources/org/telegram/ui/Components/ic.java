package org.telegram.ui.Components;
public final class ic implements Runnable {
    public final int f29414a;
    public final ob f29415b;

    public ic(ob obVar, int i9) {
        this.f29414a = i9;
        this.f29415b = obVar;
    }

    @Override
    public final void run() {
        switch (this.f29414a) {
            case 0:
                this.f29415b.performHapticFeedback(3, 2);
                return;
            default:
                this.f29415b.performHapticFeedback(3, 2);
                return;
        }
    }
}
