package org.telegram.ui.Components;
public final class wr implements Runnable {
    public final int f30339a;
    public final ds f30340b;

    public wr(ds dsVar, int i10) {
        this.f30339a = i10;
        this.f30340b = dsVar;
    }

    @Override
    public final void run() {
        switch (this.f30339a) {
            case 0:
                this.f30340b.W(false);
                return;
            default:
                ds.Q(this.f30340b);
                return;
        }
    }
}
