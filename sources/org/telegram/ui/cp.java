package org.telegram.ui;
public final class cp implements Runnable {
    public final int f46227a;
    public final mp f46228b;
    public final long f46229c;

    public cp(mp mpVar, long j3, int i7) {
        this.f46227a = i7;
        this.f46228b = mpVar;
        this.f46229c = j3;
    }

    @Override
    public final void run() {
        switch (this.f46227a) {
            case 0:
                long j3 = this.f46229c;
                mp mpVar = this.f46228b;
                mpVar.f49287n = j3;
                mpVar.f49292r = true;
                mpVar.s0();
                return;
            default:
                mp.e0(this.f46228b, this.f46229c);
                return;
        }
    }
}
