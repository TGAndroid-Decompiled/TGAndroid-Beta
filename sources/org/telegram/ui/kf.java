package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35262a;
    public final bo f35263b;
    public final long f35264c;
    public final long d;

    public kf(bo boVar, long j3, long j10, int i10) {
        this.f35262a = i10;
        this.f35263b = boVar;
        this.f35264c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f35262a) {
            case 0:
                bo.o0(this.f35263b, this.f35264c, this.d);
                return;
            default:
                bo.k1(this.f35263b, this.f35264c, this.d);
                return;
        }
    }
}
