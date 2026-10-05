package org.telegram.ui.Components;
public final class uw implements Runnable {
    public final int f31530a;
    public final bz f31531b;

    public uw(bz bzVar, int i10) {
        this.f31530a = i10;
        this.f31531b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f31530a) {
            case 0:
            default:
                this.f31531b.d();
                return;
        }
    }
}
