package org.telegram.ui;
public final class qf implements Runnable {
    public final int f39146a;
    public final fo f39147b;
    public final long f39148c;
    public final long d;

    public qf(fo foVar, long j10, long j11, int i10) {
        this.f39146a = i10;
        this.f39147b = foVar;
        this.f39148c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f39146a) {
            case 0:
                fo.Y(this.f39147b, this.f39148c, this.d);
                return;
            default:
                fo.X(this.f39147b, this.f39148c, this.d);
                return;
        }
    }
}
