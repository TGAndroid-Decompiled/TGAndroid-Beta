package org.telegram.ui.Components;
public final class hc implements Runnable {
    public final int f35864a;
    public final ob f35865b;

    public hc(ob obVar, int i7) {
        this.f35864a = i7;
        this.f35865b = obVar;
    }

    @Override
    public final void run() {
        switch (this.f35864a) {
            case 0:
                this.f35865b.performHapticFeedback(3, 2);
                return;
            default:
                this.f35865b.performHapticFeedback(3, 2);
                return;
        }
    }
}
