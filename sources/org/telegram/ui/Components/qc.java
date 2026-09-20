package org.telegram.ui.Components;
public final class qc implements Runnable {
    public final int f27560a;
    public final xb f27561b;

    public qc(xb xbVar, int i10) {
        this.f27560a = i10;
        this.f27561b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f27560a) {
            case 0:
                this.f27561b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27561b.performHapticFeedback(3, 2);
                return;
        }
    }
}
