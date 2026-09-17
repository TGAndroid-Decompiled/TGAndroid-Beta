package org.telegram.ui;
public final class gq implements Runnable {
    public final int f36773a;
    public final qq f36774b;
    public final long f36775c;

    public gq(qq qqVar, long j3, int i10) {
        this.f36773a = i10;
        this.f36774b = qqVar;
        this.f36775c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36773a) {
            case 0:
                long j3 = this.f36775c;
                qq qqVar = this.f36774b;
                qqVar.f39981n = j3;
                qqVar.f39986r = true;
                qqVar.n0();
                return;
            default:
                qq.Z(this.f36774b, this.f36775c);
                return;
        }
    }
}
