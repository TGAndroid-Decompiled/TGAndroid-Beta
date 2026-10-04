package org.telegram.ui;
public final class cq implements Runnable {
    public final int f35530a;
    public final mq f35531b;
    public final long f35532c;

    public cq(mq mqVar, long j3, int i10) {
        this.f35530a = i10;
        this.f35531b = mqVar;
        this.f35532c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35530a) {
            case 0:
                long j3 = this.f35532c;
                mq mqVar = this.f35531b;
                mqVar.f38725n = j3;
                mqVar.f38730r = true;
                mqVar.n0();
                return;
            default:
                mq.Y(this.f35531b, this.f35532c);
                return;
        }
    }
}
