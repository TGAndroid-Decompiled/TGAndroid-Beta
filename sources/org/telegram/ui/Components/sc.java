package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30680a;
    public final zb f30681b;

    public sc(zb zbVar, int i10) {
        this.f30680a = i10;
        this.f30681b = zbVar;
    }

    @Override
    public final void run() {
        switch (this.f30680a) {
            case 0:
                this.f30681b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30681b.performHapticFeedback(3, 2);
                return;
        }
    }
}
