package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f30742a;
    public final zb f30743b;

    public sc(zb zbVar, int i10) {
        this.f30742a = i10;
        this.f30743b = zbVar;
    }

    @Override
    public final void run() {
        switch (this.f30742a) {
            case 0:
                this.f30743b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30743b.performHapticFeedback(3, 2);
                return;
        }
    }
}
