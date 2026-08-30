package org.telegram.ui.Components;
public final class jc implements Runnable {
    public final int f25952a;
    public final qb f25953b;

    public jc(qb qbVar, int i10) {
        this.f25952a = i10;
        this.f25953b = qbVar;
    }

    @Override
    public final void run() {
        switch (this.f25952a) {
            case 0:
                this.f25953b.performHapticFeedback(3, 2);
                return;
            default:
                this.f25953b.performHapticFeedback(3, 2);
                return;
        }
    }
}
