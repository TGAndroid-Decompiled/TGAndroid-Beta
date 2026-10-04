package org.telegram.ui;
public final class cq implements Runnable {
    public final int f35529a;
    public final mq f35530b;
    public final long f35531c;

    public cq(mq mqVar, long j3, int i10) {
        this.f35529a = i10;
        this.f35530b = mqVar;
        this.f35531c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35529a) {
            case 0:
                long j3 = this.f35531c;
                mq mqVar = this.f35530b;
                mqVar.f38724n = j3;
                mqVar.f38729r = true;
                mqVar.n0();
                return;
            default:
                mq.Y(this.f35530b, this.f35531c);
                return;
        }
    }
}
