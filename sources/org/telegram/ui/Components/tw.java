package org.telegram.ui.Components;
public final class tw implements Runnable {
    public final int f28691a;
    public final az f28692b;

    public tw(az azVar, int i10) {
        this.f28691a = i10;
        this.f28692b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f28691a) {
            case 0:
            default:
                this.f28692b.d();
                return;
        }
    }
}
