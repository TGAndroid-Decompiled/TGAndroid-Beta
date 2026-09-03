package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f29568a;
    public final rs f29569b;

    public ns(rs rsVar, int i10) {
        this.f29568a = i10;
        this.f29569b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f29568a) {
            case 0:
                this.f29569b.W(false);
                return;
            default:
                this.f29569b.N(true);
                return;
        }
    }
}
