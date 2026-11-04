package org.telegram.ui;
public final class ky implements Runnable {
    public final int f47050a;
    public final gi.l3 f47051b;

    public ky(gi.l3 l3Var, int i3) {
        this.f47050a = i3;
        this.f47051b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f47050a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f47051b);
                return;
            default:
                this.f47051b.f(true);
                return;
        }
    }
}
