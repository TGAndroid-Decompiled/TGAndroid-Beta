package org.telegram.ui;
public final class py implements Runnable {
    public final int f51000a;
    public final kz f51001b;

    public py(kz kzVar, int i7) {
        this.f51000a = i7;
        this.f51001b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f51000a) {
            case 0:
                kz.a0(this.f51001b);
                return;
            default:
                kz.b0(this.f51001b);
                return;
        }
    }
}
