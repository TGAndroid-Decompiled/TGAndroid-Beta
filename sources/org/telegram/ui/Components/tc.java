package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f31078a;
    public final ac f31079b;

    public tc(ac acVar, int i10) {
        this.f31078a = i10;
        this.f31079b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f31078a) {
            case 0:
                this.f31079b.performHapticFeedback(3, 2);
                return;
            default:
                this.f31079b.performHapticFeedback(3, 2);
                return;
        }
    }
}
