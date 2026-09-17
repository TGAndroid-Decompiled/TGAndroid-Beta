package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35257a;
    public final bo f35258b;
    public final long f35259c;
    public final long d;

    public kf(bo boVar, long j3, long j10, int i10) {
        this.f35257a = i10;
        this.f35258b = boVar;
        this.f35259c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f35257a) {
            case 0:
                bo.o0(this.f35258b, this.f35259c, this.d);
                return;
            default:
                bo.k1(this.f35258b, this.f35259c, this.d);
                return;
        }
    }
}
