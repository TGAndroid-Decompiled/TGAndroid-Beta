package org.telegram.ui.Components;
public final class cw implements Runnable {
    public final int f34315a;
    public final hy f34316b;

    public cw(hy hyVar, int i7) {
        this.f34315a = i7;
        this.f34316b = hyVar;
    }

    @Override
    public final void run() {
        switch (this.f34315a) {
            case 0:
            default:
                this.f34316b.e();
                return;
        }
    }
}
