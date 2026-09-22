package org.telegram.ui;
public final class fq implements Runnable {
    public final int f33656a;
    public final pq f33657b;
    public final long f33658c;

    public fq(pq pqVar, long j3, int i10) {
        this.f33656a = i10;
        this.f33657b = pqVar;
        this.f33658c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33656a) {
            case 0:
                long j3 = this.f33658c;
                pq pqVar = this.f33657b;
                pqVar.f36650n = j3;
                pqVar.f36655r = true;
                pqVar.n0();
                return;
            default:
                pq.Z(this.f33657b, this.f33658c);
                return;
        }
    }
}
