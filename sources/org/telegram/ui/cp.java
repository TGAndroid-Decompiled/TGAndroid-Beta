package org.telegram.ui;
public final class cp implements Runnable {
    public final int f46199a;
    public final mp f46200b;
    public final long f46201c;

    public cp(mp mpVar, long j3, int i7) {
        this.f46199a = i7;
        this.f46200b = mpVar;
        this.f46201c = j3;
    }

    @Override
    public final void run() {
        switch (this.f46199a) {
            case 0:
                long j3 = this.f46201c;
                mp mpVar = this.f46200b;
                mpVar.f49286n = j3;
                mpVar.f49291r = true;
                mpVar.s0();
                return;
            default:
                mp.e0(this.f46200b, this.f46201c);
                return;
        }
    }
}
