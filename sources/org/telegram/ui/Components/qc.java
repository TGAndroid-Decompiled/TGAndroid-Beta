package org.telegram.ui.Components;
public final class qc implements Runnable {
    public final int f29877a;
    public final wb f29878b;

    public qc(wb wbVar, int i10) {
        this.f29877a = i10;
        this.f29878b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f29877a) {
            case 0:
                this.f29878b.performHapticFeedback(3, 2);
                return;
            default:
                this.f29878b.performHapticFeedback(3, 2);
                return;
        }
    }
}
