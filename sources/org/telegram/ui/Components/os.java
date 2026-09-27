package org.telegram.ui.Components;
public final class os implements Runnable {
    public final int f27208a;
    public final ts f27209b;

    public os(ts tsVar, int i10) {
        this.f27208a = i10;
        this.f27209b = tsVar;
    }

    @Override
    public final void run() {
        switch (this.f27208a) {
            case 0:
                this.f27209b.W(false);
                return;
            default:
                this.f27209b.N(true);
                return;
        }
    }
}
