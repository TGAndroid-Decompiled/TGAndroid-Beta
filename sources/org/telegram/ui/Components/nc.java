package org.telegram.ui.Components;
public final class nc implements Runnable {
    public final int f30956a;
    public final ub f30957b;

    public nc(ub ubVar, int i10) {
        this.f30956a = i10;
        this.f30957b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f30956a) {
            case 0:
                this.f30957b.performHapticFeedback(3, 2);
                return;
            default:
                this.f30957b.performHapticFeedback(3, 2);
                return;
        }
    }
}
