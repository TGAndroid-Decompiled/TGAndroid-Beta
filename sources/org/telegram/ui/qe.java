package org.telegram.ui;
public final class qe implements Runnable {
    public final int f50585a;
    public final an f50586b;
    public final long f50587c;
    public final long d;

    public qe(an anVar, long j3, long j10, int i7) {
        this.f50585a = i7;
        this.f50586b = anVar;
        this.f50587c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f50585a) {
            case 0:
                an.p0(this.f50586b, this.f50587c, this.d);
                return;
            default:
                an.G1(this.f50586b, this.f50587c, this.d);
                return;
        }
    }
}
