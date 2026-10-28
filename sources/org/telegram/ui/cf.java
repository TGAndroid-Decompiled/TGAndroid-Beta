package org.telegram.ui;
public final class cf implements Runnable {
    public final int f38281a;
    public final wn f38282b;
    public final long f38283c;
    public final long d;

    public cf(wn wnVar, long j10, long j11, int i10) {
        this.f38281a = i10;
        this.f38282b = wnVar;
        this.f38283c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f38281a) {
            case 0:
                wn.G0(this.f38282b, this.f38283c, this.d);
                return;
            default:
                wn.Y0(this.f38282b, this.f38283c, this.d);
                return;
        }
    }
}
