package org.telegram.ui;
public final class bq implements Runnable {
    public final int f32412a;
    public final lq f32413b;
    public final long f32414c;

    public bq(lq lqVar, long j3, int i10) {
        this.f32412a = i10;
        this.f32413b = lqVar;
        this.f32414c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32412a) {
            case 0:
                long j3 = this.f32414c;
                lq lqVar = this.f32413b;
                lqVar.f35421n = j3;
                lqVar.f35426r = true;
                lqVar.n0();
                return;
            default:
                lq.Z(this.f32413b, this.f32414c);
                return;
        }
    }
}
