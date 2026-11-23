package org.telegram.ui.Components;
public final class cw implements Runnable {
    public final int f34309a;
    public final hy f34310b;

    public cw(hy hyVar, int i7) {
        this.f34309a = i7;
        this.f34310b = hyVar;
    }

    @Override
    public final void run() {
        switch (this.f34309a) {
            case 0:
            default:
                this.f34310b.e();
                return;
        }
    }
}
