package org.telegram.ui.Components;
public final class os implements Runnable {
    public final int f27182a;
    public final ts f27183b;

    public os(ts tsVar, int i10) {
        this.f27182a = i10;
        this.f27183b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f27182a) {
            case 0:
                this.f27183b.W(false);
                return;
            default:
                this.f27183b.N(true);
                return;
        }
    }
}
