package org.telegram.ui;
public final class gq implements Runnable {
    public final int f36746a;
    public final qq f36747b;
    public final long f36748c;

    public gq(qq qqVar, long j3, int i10) {
        this.f36746a = i10;
        this.f36747b = qqVar;
        this.f36748c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36746a) {
            case 0:
                long j3 = this.f36748c;
                qq qqVar = this.f36747b;
                qqVar.f39954n = j3;
                qqVar.f39959r = true;
                qqVar.n0();
                return;
            default:
                qq.Z(this.f36747b, this.f36748c);
                return;
        }
    }
}
