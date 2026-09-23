package org.telegram.ui;
public final class bq implements Runnable {
    public final int f32158a;
    public final lq f32159b;
    public final long f32160c;

    public bq(lq lqVar, long j3, int i10) {
        this.f32158a = i10;
        this.f32159b = lqVar;
        this.f32160c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32158a) {
            case 0:
                long j3 = this.f32160c;
                lq lqVar = this.f32159b;
                lqVar.f35059n = j3;
                lqVar.f35064r = true;
                lqVar.n0();
                return;
            default:
                lq.Z(this.f32159b, this.f32160c);
                return;
        }
    }
}
