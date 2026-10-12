package org.telegram.ui;
public final class jq implements Runnable {
    public final int f37417a;
    public final tq f37418b;
    public final long f37419c;

    public jq(tq tqVar, long j10, int i10) {
        this.f37417a = i10;
        this.f37418b = tqVar;
        this.f37419c = j10;
    }

    @Override
    public final void run() {
        switch (this.f37417a) {
            case 0:
                long j10 = this.f37419c;
                tq tqVar = this.f37418b;
                tqVar.f40452n = j10;
                tqVar.f40457r = true;
                tqVar.n0();
                return;
            default:
                tq.Z(this.f37418b, this.f37419c);
                return;
        }
    }
}
