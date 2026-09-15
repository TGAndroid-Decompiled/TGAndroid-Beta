package org.telegram.ui;
public final class fq implements Runnable {
    public final int f33642a;
    public final pq f33643b;
    public final long f33644c;

    public fq(pq pqVar, long j3, int i10) {
        this.f33642a = i10;
        this.f33643b = pqVar;
        this.f33644c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33642a) {
            case 0:
                long j3 = this.f33644c;
                pq pqVar = this.f33643b;
                pqVar.f36650n = j3;
                pqVar.f36655r = true;
                pqVar.n0();
                return;
            default:
                pq.Z(this.f33643b, this.f33644c);
                return;
        }
    }
}
