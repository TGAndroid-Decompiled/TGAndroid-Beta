package org.telegram.ui.Components;
public final class uw implements Runnable {
    public final int f31455a;
    public final bz f31456b;

    public uw(bz bzVar, int i10) {
        this.f31455a = i10;
        this.f31456b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f31455a) {
            case 0:
            default:
                this.f31456b.d();
                return;
        }
    }
}
