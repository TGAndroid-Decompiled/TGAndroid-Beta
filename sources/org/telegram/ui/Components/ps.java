package org.telegram.ui.Components;
public final class ps implements Runnable {
    public final int f29735a;
    public final us f29736b;

    public ps(us usVar, int i10) {
        this.f29735a = i10;
        this.f29736b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f29735a) {
            case 0:
                this.f29736b.W(false);
                return;
            default:
                this.f29736b.N(true);
                return;
        }
    }
}
