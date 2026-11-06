package org.telegram.ui;
public final class oy implements Runnable {
    public final int f48565a;
    public final fi.m3 f48566b;

    public oy(fi.m3 m3Var, int i7) {
        this.f48565a = i7;
        this.f48566b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f48565a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f48566b);
                return;
            default:
                this.f48566b.f(true);
                return;
        }
    }
}
