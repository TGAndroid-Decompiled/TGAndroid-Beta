package org.telegram.ui;
public final class oy implements Runnable {
    public final int f48570a;
    public final fi.m3 f48571b;

    public oy(fi.m3 m3Var, int i7) {
        this.f48570a = i7;
        this.f48571b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f48570a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f48571b);
                return;
            default:
                this.f48571b.f(true);
                return;
        }
    }
}
