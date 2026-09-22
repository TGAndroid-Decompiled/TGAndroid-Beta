package org.telegram.ui.Components;
public final class qc implements Runnable {
    public final int f27536a;
    public final xb f27537b;

    public qc(xb xbVar, int i10) {
        this.f27536a = i10;
        this.f27537b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f27536a) {
            case 0:
                this.f27537b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27537b.performHapticFeedback(3, 2);
                return;
        }
    }
}
