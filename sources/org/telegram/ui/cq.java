package org.telegram.ui;
public final class cq implements Runnable {
    public final int f35535a;
    public final mq f35536b;
    public final long f35537c;

    public cq(mq mqVar, long j3, int i10) {
        this.f35535a = i10;
        this.f35536b = mqVar;
        this.f35537c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35535a) {
            case 0:
                long j3 = this.f35537c;
                mq mqVar = this.f35536b;
                mqVar.f38730n = j3;
                mqVar.f38735r = true;
                mqVar.n0();
                return;
            default:
                mq.Y(this.f35536b, this.f35537c);
                return;
        }
    }
}
