package org.telegram.ui.Components;
public final class os implements Runnable {
    public final int f27114a;
    public final ts f27115b;

    public os(ts tsVar, int i10) {
        this.f27114a = i10;
        this.f27115b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f27114a) {
            case 0:
                this.f27115b.W(false);
                return;
            default:
                this.f27115b.N(true);
                return;
        }
    }
}
