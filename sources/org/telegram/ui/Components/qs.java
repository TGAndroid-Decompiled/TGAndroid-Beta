package org.telegram.ui.Components;
public final class qs implements Runnable {
    public final int f30285a;
    public final ws f30286b;

    public qs(ws wsVar, int i10) {
        this.f30285a = i10;
        this.f30286b = wsVar;
    }

    @Override
    public final void run() {
        switch (this.f30285a) {
            case 0:
                this.f30286b.X(false);
                return;
            default:
                ws.R(this.f30286b);
                return;
        }
    }
}
