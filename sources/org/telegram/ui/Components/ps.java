package org.telegram.ui.Components;
public final class ps implements Runnable {
    public final int f29736a;
    public final us f29737b;

    public ps(us usVar, int i10) {
        this.f29736a = i10;
        this.f29737b = usVar;
    }

    @Override
    public final void run() {
        switch (this.f29736a) {
            case 0:
                this.f29737b.W(false);
                return;
            default:
                this.f29737b.N(true);
                return;
        }
    }
}
