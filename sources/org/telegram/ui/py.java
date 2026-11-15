package org.telegram.ui;
public final class py implements Runnable {
    public final int f50384a;
    public final hi.l3 f50385b;

    public py(hi.l3 l3Var, int i7) {
        this.f50384a = i7;
        this.f50385b = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f50384a) {
            case 0:
                org.telegram.messenger.g0.E2(this.f50385b);
                return;
            default:
                this.f50385b.f(true);
                return;
        }
    }
}
