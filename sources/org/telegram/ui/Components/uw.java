package org.telegram.ui.Components;
public final class uw implements Runnable {
    public final int f28889a;
    public final az f28890b;

    public uw(az azVar, int i10) {
        this.f28889a = i10;
        this.f28890b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f28889a) {
            case 0:
            default:
                this.f28890b.d();
                return;
        }
    }
}
