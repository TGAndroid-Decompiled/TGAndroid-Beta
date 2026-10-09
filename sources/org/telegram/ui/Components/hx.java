package org.telegram.ui.Components;
public final class hx implements Runnable {
    public final int f27148a;
    public final nz f27149b;

    public hx(nz nzVar, int i10) {
        this.f27148a = i10;
        this.f27149b = nzVar;
    }

    @Override
    public final void run() {
        switch (this.f27148a) {
            case 0:
            default:
                this.f27149b.d();
                return;
        }
    }
}
