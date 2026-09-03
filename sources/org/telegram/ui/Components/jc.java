package org.telegram.ui.Components;
public final class jc implements Runnable {
    public final int f25933a;
    public final qb f25934b;

    public jc(qb qbVar, int i10) {
        this.f25933a = i10;
        this.f25934b = qbVar;
    }

    @Override
    public final void run() {
        switch (this.f25933a) {
            case 0:
                this.f25934b.performHapticFeedback(3, 2);
                return;
            default:
                this.f25934b.performHapticFeedback(3, 2);
                return;
        }
    }
}
