package org.telegram.ui.Components;
public final class ks implements Runnable {
    public final int f26389a;
    public final os f26390b;

    public ks(os osVar, int i10) {
        this.f26389a = i10;
        this.f26390b = osVar;
    }

    @Override
    public final void run() {
        switch (this.f26389a) {
            case 0:
                this.f26390b.W(false);
                return;
            default:
                this.f26390b.N(true);
                return;
        }
    }
}
