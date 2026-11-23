package org.telegram.ui.Components;
public final class hc implements Runnable {
    public final int f35816a;
    public final ob f35817b;

    public hc(ob obVar, int i7) {
        this.f35816a = i7;
        this.f35817b = obVar;
    }

    @Override
    public final void run() {
        switch (this.f35816a) {
            case 0:
                this.f35817b.performHapticFeedback(3, 2);
                return;
            default:
                this.f35817b.performHapticFeedback(3, 2);
                return;
        }
    }
}
