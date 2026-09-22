package org.telegram.ui;
public final class hf implements Runnable {
    public final int f34240a;
    public final bo f34241b;
    public final long f34242c;
    public final long d;

    public hf(bo boVar, long j3, long j10, int i10) {
        this.f34240a = i10;
        this.f34241b = boVar;
        this.f34242c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34240a) {
            case 0:
                bo.o0(this.f34241b, this.f34242c, this.d);
                return;
            default:
                bo.k1(this.f34241b, this.f34242c, this.d);
                return;
        }
    }
}
