package org.telegram.ui.Components;
public final class qc implements Runnable {
    public final int f26383a;
    public final xb f26384b;

    public qc(xb xbVar, int i10) {
        this.f26383a = i10;
        this.f26384b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f26383a) {
            case 0:
                this.f26384b.performHapticFeedback(3, 2);
                return;
            default:
                this.f26384b.performHapticFeedback(3, 2);
                return;
        }
    }
}
