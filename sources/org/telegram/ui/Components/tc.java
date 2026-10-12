package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f30849a;
    public final ac f30850b;

    public tc(ac acVar, int i10) {
        this.f30849a = i10;
        this.f30850b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f30849a) {
            case 0:
                this.f30850b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30850b.performHapticFeedback(3, 2);
                return;
        }
    }
}
