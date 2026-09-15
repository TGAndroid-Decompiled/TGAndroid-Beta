package org.telegram.ui;
public final class hf implements Runnable {
    public final int f34257a;
    public final bo f34258b;
    public final long f34259c;
    public final long d;

    public hf(bo boVar, long j3, long j10, int i10) {
        this.f34257a = i10;
        this.f34258b = boVar;
        this.f34259c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34257a) {
            case 0:
                bo.o0(this.f34258b, this.f34259c, this.d);
                return;
            default:
                bo.k1(this.f34258b, this.f34259c, this.d);
                return;
        }
    }
}
