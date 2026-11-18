package org.telegram.ui.Components;
public final class hc implements Runnable {
    public final int f35846a;
    public final ob f35847b;

    public hc(ob obVar, int i7) {
        this.f35846a = i7;
        this.f35847b = obVar;
    }

    @Override
    public final void run() {
        switch (this.f35846a) {
            case 0:
                this.f35847b.performHapticFeedback(3, 2);
                return;
            default:
                this.f35847b.performHapticFeedback(3, 2);
                return;
        }
    }
}
