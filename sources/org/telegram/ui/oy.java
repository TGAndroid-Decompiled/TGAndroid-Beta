package org.telegram.ui;
public final class oy implements Runnable {
    public final int f48558a;
    public final fi.m3 f48559b;

    public oy(fi.m3 m3Var, int i7) {
        this.f48558a = i7;
        this.f48559b = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f48558a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f48559b);
                return;
            default:
                this.f48559b.f(true);
                return;
        }
    }
}
