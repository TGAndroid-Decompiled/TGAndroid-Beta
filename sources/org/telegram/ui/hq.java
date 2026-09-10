package org.telegram.ui;
public final class hq implements Runnable {
    public final int f33435a;
    public final rq f33436b;
    public final long f33437c;

    public hq(rq rqVar, long j3, int i10) {
        this.f33435a = i10;
        this.f33436b = rqVar;
        this.f33437c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33435a) {
            case 0:
                long j3 = this.f33437c;
                rq rqVar = this.f33436b;
                rqVar.f36425n = j3;
                rqVar.f36430r = true;
                rqVar.n0();
                return;
            default:
                rq.Z(this.f33436b, this.f33437c);
                return;
        }
    }
}
