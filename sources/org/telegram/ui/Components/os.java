package org.telegram.ui.Components;
public final class os implements Runnable {
    public final int f27183a;
    public final ts f27184b;

    public os(ts tsVar, int i10) {
        this.f27183a = i10;
        this.f27184b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f27183a) {
            case 0:
                this.f27184b.W(false);
                return;
            default:
                this.f27184b.N(true);
                return;
        }
    }
}
