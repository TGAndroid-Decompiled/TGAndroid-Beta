package org.telegram.ui;
public final class md0 implements Runnable {
    public final int f47858a;
    public final r3 f47859b;

    public md0(r3 r3Var, int i7) {
        this.f47858a = i7;
        this.f47859b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f47858a) {
            case 0:
                org.telegram.messenger.g0.h3(new md0(this.f47859b, 1));
                return;
            default:
                this.f47859b.a("CANCELLED");
                return;
        }
    }
}
