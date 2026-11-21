package org.telegram.ui.Components;
public final class hc implements Runnable {
    public final int f35870a;
    public final ob f35871b;

    public hc(ob obVar, int i7) {
        this.f35870a = i7;
        this.f35871b = obVar;
    }

    @Override
    public final void run() {
        switch (this.f35870a) {
            case 0:
                this.f35871b.performHapticFeedback(3, 2);
                return;
            default:
                this.f35871b.performHapticFeedback(3, 2);
                return;
        }
    }
}
