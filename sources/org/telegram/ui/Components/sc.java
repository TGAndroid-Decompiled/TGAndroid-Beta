package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30686a;
    public final zb f30687b;

    public sc(zb zbVar, int i10) {
        this.f30686a = i10;
        this.f30687b = zbVar;
    }

    @Override
    public final void run() {
        switch (this.f30686a) {
            case 0:
                this.f30687b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30687b.performHapticFeedback(3, 2);
                return;
        }
    }
}
