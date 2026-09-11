package org.telegram.ui;
public final class gq implements Runnable {
    public final int f36745a;
    public final qq f36746b;
    public final long f36747c;

    public gq(qq qqVar, long j3, int i10) {
        this.f36745a = i10;
        this.f36746b = qqVar;
        this.f36747c = j3;
    }

    @Override
    public final void run() {
        switch (this.f36745a) {
            case 0:
                long j3 = this.f36747c;
                qq qqVar = this.f36746b;
                qqVar.f39953n = j3;
                qqVar.f39958r = true;
                qqVar.n0();
                return;
            default:
                qq.Z(this.f36746b, this.f36747c);
                return;
        }
    }
}
