package org.telegram.ui;
public final class fq implements Runnable {
    public final int f33740a;
    public final pq f33741b;
    public final long f33742c;

    public fq(pq pqVar, long j3, int i10) {
        this.f33740a = i10;
        this.f33741b = pqVar;
        this.f33742c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33740a) {
            case 0:
                long j3 = this.f33742c;
                pq pqVar = this.f33741b;
                pqVar.f36699n = j3;
                pqVar.f36704r = true;
                pqVar.n0();
                return;
            default:
                pq.Z(this.f33741b, this.f33742c);
                return;
        }
    }
}
