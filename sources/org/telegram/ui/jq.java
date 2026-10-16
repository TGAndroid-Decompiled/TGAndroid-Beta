package org.telegram.ui;
public final class jq implements Runnable {
    public final int f37118a;
    public final tq f37119b;
    public final long f37120c;

    public jq(tq tqVar, long j10, int i10) {
        this.f37118a = i10;
        this.f37119b = tqVar;
        this.f37120c = j10;
    }

    @Override
    public final void run() {
        switch (this.f37118a) {
            case 0:
                long j10 = this.f37120c;
                tq tqVar = this.f37119b;
                tqVar.f40180n = j10;
                tqVar.f40185r = true;
                tqVar.n0();
                return;
            default:
                tq.Z(this.f37119b, this.f37120c);
                return;
        }
    }
}
