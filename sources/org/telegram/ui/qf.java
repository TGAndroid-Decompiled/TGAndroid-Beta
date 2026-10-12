package org.telegram.ui;
public final class qf implements Runnable {
    public final int f39424a;
    public final fo f39425b;
    public final long f39426c;
    public final long d;

    public qf(fo foVar, long j10, long j11, int i10) {
        this.f39424a = i10;
        this.f39425b = foVar;
        this.f39426c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f39424a) {
            case 0:
                fo.Y(this.f39425b, this.f39426c, this.d);
                return;
            default:
                fo.X(this.f39425b, this.f39426c, this.d);
                return;
        }
    }
}
