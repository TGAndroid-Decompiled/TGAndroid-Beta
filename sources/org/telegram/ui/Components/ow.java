package org.telegram.ui.Components;
public final class ow implements Runnable {
    public final int f27680a;
    public final xy f27681b;

    public ow(xy xyVar, int i10) {
        this.f27680a = i10;
        this.f27681b = xyVar;
    }

    @Override
    public final void run() {
        switch (this.f27680a) {
            case 0:
            default:
                this.f27681b.d();
                return;
        }
    }
}
