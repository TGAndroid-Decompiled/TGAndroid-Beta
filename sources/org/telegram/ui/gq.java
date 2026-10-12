package org.telegram.ui;
public final class gq implements Runnable {
    public final int f38118a;
    public final qq f38119b;
    public final long f38120c;

    public gq(qq qqVar, long j3, int i10) {
        this.f38118a = i10;
        this.f38119b = qqVar;
        this.f38120c = j3;
    }

    @Override
    public final void run() {
        switch (this.f38118a) {
            case 0:
                long j3 = this.f38120c;
                qq qqVar = this.f38119b;
                qqVar.f41407n = j3;
                qqVar.f41412r = true;
                qqVar.n0();
                return;
            default:
                qq.Z(this.f38119b, this.f38120c);
                return;
        }
    }
}
