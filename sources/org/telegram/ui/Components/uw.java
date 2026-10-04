package org.telegram.ui.Components;
public final class uw implements Runnable {
    public final int f31449a;
    public final bz f31450b;

    public uw(bz bzVar, int i10) {
        this.f31449a = i10;
        this.f31450b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f31449a) {
            case 0:
            default:
                this.f31450b.d();
                return;
        }
    }
}
