package org.telegram.ui.Components;
public final class uw implements Runnable {
    public final int f31448a;
    public final bz f31449b;

    public uw(bz bzVar, int i10) {
        this.f31448a = i10;
        this.f31449b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f31448a) {
            case 0:
            default:
                this.f31449b.d();
                return;
        }
    }
}
