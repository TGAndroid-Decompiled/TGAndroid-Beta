package org.telegram.ui.Components;
public final class uw implements Runnable {
    public final int f28928a;
    public final bz f28929b;

    public uw(bz bzVar, int i10) {
        this.f28928a = i10;
        this.f28929b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f28928a) {
            case 0:
            default:
                this.f28929b.d();
                return;
        }
    }
}
