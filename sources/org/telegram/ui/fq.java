package org.telegram.ui;
public final class fq implements Runnable {
    public final int f33736a;
    public final pq f33737b;
    public final long f33738c;

    public fq(pq pqVar, long j3, int i10) {
        this.f33736a = i10;
        this.f33737b = pqVar;
        this.f33738c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33736a) {
            case 0:
                long j3 = this.f33738c;
                pq pqVar = this.f33737b;
                pqVar.f36694n = j3;
                pqVar.f36699r = true;
                pqVar.n0();
                return;
            default:
                pq.Z(this.f33737b, this.f33738c);
                return;
        }
    }
}
