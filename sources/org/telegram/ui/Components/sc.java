package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30679a;
    public final zb f30680b;

    public sc(zb zbVar, int i10) {
        this.f30679a = i10;
        this.f30680b = zbVar;
    }

    @Override
    public final void run() {
        switch (this.f30679a) {
            case 0:
                this.f30680b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30680b.performHapticFeedback(3, 2);
                return;
        }
    }
}
