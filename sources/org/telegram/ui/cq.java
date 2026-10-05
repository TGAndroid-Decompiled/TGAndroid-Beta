package org.telegram.ui;
public final class cq implements Runnable {
    public final int f35527a;
    public final mq f35528b;
    public final long f35529c;

    public cq(mq mqVar, long j3, int i10) {
        this.f35527a = i10;
        this.f35528b = mqVar;
        this.f35529c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35527a) {
            case 0:
                long j3 = this.f35529c;
                mq mqVar = this.f35528b;
                mqVar.f38716n = j3;
                mqVar.f38721r = true;
                mqVar.n0();
                return;
            default:
                mq.Y(this.f35528b, this.f35529c);
                return;
        }
    }
}
