package org.telegram.ui;
public final class bq implements Runnable {
    public final int f32933a;
    public final lq f32934b;
    public final long f32935c;

    public bq(lq lqVar, long j10, int i10) {
        this.f32933a = i10;
        this.f32934b = lqVar;
        this.f32935c = j10;
    }

    @Override
    public final void run() {
        switch (this.f32933a) {
            case 0:
                long j10 = this.f32935c;
                lq lqVar = this.f32934b;
                lqVar.f35879n = j10;
                lqVar.f35884r = true;
                lqVar.n0();
                return;
            default:
                lq.Z(this.f32934b, this.f32935c);
                return;
        }
    }
}
