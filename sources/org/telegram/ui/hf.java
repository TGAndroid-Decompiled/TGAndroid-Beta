package org.telegram.ui;
public final class hf implements Runnable {
    public final int f36978a;
    public final co f36979b;
    public final long f36980c;
    public final long d;

    public hf(co coVar, long j3, long j10, int i10) {
        this.f36978a = i10;
        this.f36979b = coVar;
        this.f36980c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f36978a) {
            case 0:
                co.o0(this.f36979b, this.f36980c, this.d);
                return;
            default:
                co.k1(this.f36979b, this.f36980c, this.d);
                return;
        }
    }
}
