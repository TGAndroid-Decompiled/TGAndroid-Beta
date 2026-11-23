package org.telegram.ui;
public final class py implements Runnable {
    public final int f51004a;
    public final kz f51005b;

    public py(kz kzVar, int i7) {
        this.f51004a = i7;
        this.f51005b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f51004a) {
            case 0:
                kz.a0(this.f51005b);
                return;
            default:
                kz.b0(this.f51005b);
                return;
        }
    }
}
