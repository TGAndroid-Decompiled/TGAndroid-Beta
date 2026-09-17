package org.telegram.ui;
public final class hf implements Runnable {
    public final int f37005a;
    public final co f37006b;
    public final long f37007c;
    public final long d;

    public hf(co coVar, long j3, long j10, int i10) {
        this.f37005a = i10;
        this.f37006b = coVar;
        this.f37007c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f37005a) {
            case 0:
                co.o0(this.f37006b, this.f37007c, this.d);
                return;
            default:
                co.k1(this.f37006b, this.f37007c, this.d);
                return;
        }
    }
}
