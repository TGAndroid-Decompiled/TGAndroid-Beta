package org.telegram.ui;
public final class qe implements Runnable {
    public final int f50594a;
    public final an f50595b;
    public final long f50596c;
    public final long d;

    public qe(an anVar, long j3, long j10, int i7) {
        this.f50594a = i7;
        this.f50595b = anVar;
        this.f50596c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f50594a) {
            case 0:
                an.p0(this.f50595b, this.f50596c, this.d);
                return;
            default:
                an.G1(this.f50595b, this.f50596c, this.d);
                return;
        }
    }
}
