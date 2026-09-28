package org.telegram.ui.Components;
public final class os implements Runnable {
    public final int f27184a;
    public final ts f27185b;

    public os(ts tsVar, int i10) {
        this.f27184a = i10;
        this.f27185b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f27184a) {
            case 0:
                this.f27185b.W(false);
                return;
            default:
                this.f27185b.N(true);
                return;
        }
    }
}
