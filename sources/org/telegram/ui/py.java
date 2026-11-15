package org.telegram.ui;
public final class py implements Runnable {
    public final int f50393a;
    public final hi.l3 f50394b;

    public py(hi.l3 l3Var, int i7) {
        this.f50393a = i7;
        this.f50394b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f50393a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f50394b);
                return;
            default:
                this.f50394b.f(true);
                return;
        }
    }
}
