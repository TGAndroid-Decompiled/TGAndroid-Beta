package org.telegram.ui.Components;
public final class hc implements Runnable {
    public final int f35863a;
    public final ob f35864b;

    public hc(ob obVar, int i7) {
        this.f35863a = i7;
        this.f35864b = obVar;
    }

    @Override
    public final void run() {
        switch (this.f35863a) {
            case 0:
                this.f35864b.performHapticFeedback(3, 2);
                return;
            default:
                this.f35864b.performHapticFeedback(3, 2);
                return;
        }
    }
}
