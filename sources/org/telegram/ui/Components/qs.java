package org.telegram.ui.Components;
public final class qs implements Runnable {
    public final int f30237a;
    public final ws f30238b;

    public qs(ws wsVar, int i10) {
        this.f30237a = i10;
        this.f30238b = wsVar;
    }

    @Override
    public final void run() {
        switch (this.f30237a) {
            case 0:
                this.f30238b.X(false);
                return;
            default:
                ws.R(this.f30238b);
                return;
        }
    }
}
