package org.telegram.ui;
public final class py implements Runnable {
    public final int f50936a;
    public final kz f50937b;

    public py(kz kzVar, int i7) {
        this.f50936a = i7;
        this.f50937b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f50936a) {
            case 0:
                kz.a0(this.f50937b);
                return;
            default:
                kz.b0(this.f50937b);
                return;
        }
    }
}
