package org.telegram.ui;
public final class hf implements Runnable {
    public final int f37004a;
    public final co f37005b;
    public final long f37006c;
    public final long d;

    public hf(co coVar, long j3, long j10, int i10) {
        this.f37004a = i10;
        this.f37005b = coVar;
        this.f37006c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f37004a) {
            case 0:
                co.o0(this.f37005b, this.f37006c, this.d);
                return;
            default:
                co.k1(this.f37005b, this.f37006c, this.d);
                return;
        }
    }
}
