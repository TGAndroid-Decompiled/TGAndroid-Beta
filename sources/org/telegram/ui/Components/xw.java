package org.telegram.ui.Components;
public final class xw implements Runnable {
    public final int f29179a;
    public final fz f29180b;

    public xw(fz fzVar, int i10) {
        this.f29179a = i10;
        this.f29180b = fzVar;
    }

    @Override
    public final void run() {
        switch (this.f29179a) {
            case 0:
            default:
                this.f29180b.d();
                return;
        }
    }
}
