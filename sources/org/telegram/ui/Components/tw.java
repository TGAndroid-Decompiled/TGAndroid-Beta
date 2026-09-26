package org.telegram.ui.Components;
public final class tw implements Runnable {
    public final int f28614a;
    public final az f28615b;

    public tw(az azVar, int i10) {
        this.f28614a = i10;
        this.f28615b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f28614a) {
            case 0:
            default:
                this.f28615b.d();
                return;
        }
    }
}
