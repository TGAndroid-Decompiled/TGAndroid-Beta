package org.telegram.ui;
public final class oy implements Runnable {
    public final int f48564a;
    public final fi.m3 f48565b;

    public oy(fi.m3 m3Var, int i7) {
        this.f48564a = i7;
        this.f48565b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f48564a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f48565b);
                return;
            default:
                this.f48565b.f(true);
                return;
        }
    }
}
