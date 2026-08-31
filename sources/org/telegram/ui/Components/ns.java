package org.telegram.ui.Components;
public final class ns implements Runnable {
    public final int f29616a;
    public final rs f29617b;

    public ns(rs rsVar, int i10) {
        this.f29616a = i10;
        this.f29617b = rsVar;
    }

    @Override
    public final void run() {
        switch (this.f29616a) {
            case 0:
                this.f29617b.W(false);
                return;
            default:
                this.f29617b.N(true);
                return;
        }
    }
}
