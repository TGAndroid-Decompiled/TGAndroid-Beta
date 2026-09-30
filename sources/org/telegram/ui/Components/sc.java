package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f28231a;
    public final zb f28232b;

    public sc(zb zbVar, int i10) {
        this.f28231a = i10;
        this.f28232b = zbVar;
    }

    @Override
    public final void run() {
        switch (this.f28231a) {
            case 0:
                this.f28232b.performHapticFeedback(3, 2);
                return;
            default:
                this.f28232b.performHapticFeedback(3, 2);
                return;
        }
    }
}
