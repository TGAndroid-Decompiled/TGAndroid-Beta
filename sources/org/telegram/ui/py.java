package org.telegram.ui;
public final class py implements Runnable {
    public final int f50955a;
    public final kz f50956b;

    public py(kz kzVar, int i7) {
        this.f50955a = i7;
        this.f50956b = kzVar;
    }

    @Override
    public final void run() {
        switch (this.f50955a) {
            case 0:
                kz.a0(this.f50956b);
                return;
            default:
                kz.b0(this.f50956b);
                return;
        }
    }
}
