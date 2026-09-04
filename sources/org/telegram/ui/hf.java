package org.telegram.ui;
public final class hf implements Runnable {
    public final int f36977a;
    public final co f36978b;
    public final long f36979c;
    public final long d;

    public hf(co coVar, long j3, long j10, int i10) {
        this.f36977a = i10;
        this.f36978b = coVar;
        this.f36979c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f36977a) {
            case 0:
                co.o0(this.f36978b, this.f36979c, this.d);
                return;
            default:
                co.k1(this.f36978b, this.f36979c, this.d);
                return;
        }
    }
}
