package org.telegram.ui.Components;
public final class kc implements Runnable {
    public final int f28383a;
    public final qb f28384b;

    public kc(qb qbVar, int i10) {
        this.f28383a = i10;
        this.f28384b = qbVar;
    }

    @Override
    public final void run() {
        switch (this.f28383a) {
            case 0:
                this.f28384b.performHapticFeedback(3, 2);
                return;
            default:
                this.f28384b.performHapticFeedback(3, 2);
                return;
        }
    }
}
