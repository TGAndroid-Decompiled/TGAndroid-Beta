package org.telegram.ui;
public final class gq implements Runnable {
    public final int f36772a;
    public final qq f36773b;
    public final long f36774c;

    public gq(qq qqVar, long j3, int i10) {
        this.f36772a = i10;
        this.f36773b = qqVar;
        this.f36774c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36772a) {
            case 0:
                long j3 = this.f36774c;
                qq qqVar = this.f36773b;
                qqVar.f39980n = j3;
                qqVar.f39985r = true;
                qqVar.n0();
                return;
            default:
                qq.Z(this.f36773b, this.f36774c);
                return;
        }
    }
}
