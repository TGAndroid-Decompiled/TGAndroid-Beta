package org.telegram.ui;
public final class py implements Runnable {
    public final int f51034a;
    public final kz f51035b;

    public py(kz kzVar, int i7) {
        this.f51034a = i7;
        this.f51035b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f51034a) {
            case 0:
                kz.a0(this.f51035b);
                return;
            default:
                kz.b0(this.f51035b);
                return;
        }
    }
}
