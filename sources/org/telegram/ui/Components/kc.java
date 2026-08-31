package org.telegram.ui.Components;
public final class kc implements Runnable {
    public final int f28361a;
    public final qb f28362b;

    public kc(qb qbVar, int i10) {
        this.f28361a = i10;
        this.f28362b = qbVar;
    }

    @Override
    public final void run() {
        switch (this.f28361a) {
            case 0:
                this.f28362b.performHapticFeedback(3, 2);
                return;
            default:
                this.f28362b.performHapticFeedback(3, 2);
                return;
        }
    }
}
