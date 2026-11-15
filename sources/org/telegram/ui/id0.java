package org.telegram.ui;
public final class id0 implements Runnable {
    public final int f48024a;
    public final r3 f48025b;

    public id0(r3 r3Var, int i7) {
        this.f48024a = i7;
        this.f48025b = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f48024a) {
            case 0:
                org.telegram.messenger.g0.h3(new id0(this.f48025b, 1));
                return;
            default:
                this.f48025b.a("CANCELLED");
                return;
        }
    }
}
