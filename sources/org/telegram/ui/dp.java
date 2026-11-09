package org.telegram.ui;
public final class dp implements Runnable {
    public final int f45095a;
    public final mp f45096b;
    public final long f45097c;

    public dp(mp mpVar, long j3, int i7) {
        this.f45095a = i7;
        this.f45096b = mpVar;
        this.f45097c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45095a) {
            case 0:
                long j3 = this.f45097c;
                mp mpVar = this.f45096b;
                mpVar.f47927n = j3;
                mpVar.f47932r = true;
                mpVar.s0();
                return;
            default:
                mp.e0(this.f45096b, this.f45097c);
                return;
        }
    }
}
