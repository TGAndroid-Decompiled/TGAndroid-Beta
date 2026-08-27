package org.telegram.ui.Components;

public final class fc implements Runnable {

    public final int f28345a;

    public final mb f28346b;

    public fc(mb mbVar, int i10) {
        this.f28345a = i10;
        this.f28346b = mbVar;
    }

    @Override
    public final void run() {
        switch (this.f28345a) {
            case 0:
                this.f28346b.performHapticFeedback(3, 2);
                break;
            default:
                this.f28346b.performHapticFeedback(3, 2);
                break;
        }
    }
}
