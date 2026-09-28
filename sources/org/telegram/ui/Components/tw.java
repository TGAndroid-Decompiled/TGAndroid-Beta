package org.telegram.ui.Components;
public final class tw implements Runnable {
    public final int f28627a;
    public final az f28628b;

    public tw(az azVar, int i10) {
        this.f28627a = i10;
        this.f28628b = azVar;
    }

    @Override
    public final void run() {
        switch (this.f28627a) {
            case 0:
            default:
                this.f28628b.d();
                return;
        }
    }
}
