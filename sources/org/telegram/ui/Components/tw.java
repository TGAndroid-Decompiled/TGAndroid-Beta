package org.telegram.ui.Components;
public final class tw implements Runnable {
    public final int f28628a;
    public final az f28629b;

    public tw(az azVar, int i10) {
        this.f28628a = i10;
        this.f28629b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f28628a) {
            case 0:
            default:
                this.f28629b.d();
                return;
        }
    }
}
