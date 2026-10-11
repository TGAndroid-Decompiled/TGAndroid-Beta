package org.telegram.ui.Components;
public final class qs implements Runnable {
    public final int f30319a;
    public final ws f30320b;

    public qs(ws wsVar, int i10) {
        this.f30319a = i10;
        this.f30320b = wsVar;
    }

    @Override
    public final void run() {
        switch (this.f30319a) {
            case 0:
                this.f30320b.X(false);
                return;
            default:
                ws.R(this.f30320b);
                return;
        }
    }
}
