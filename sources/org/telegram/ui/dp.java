package org.telegram.ui;
public final class dp implements Runnable {
    public final int f46982a;
    public final np f46983b;
    public final long f46984c;

    public dp(np npVar, long j3, int i7) {
        this.f46982a = i7;
        this.f46983b = npVar;
        this.f46984c = j3;
    }

    @Override
    public final void run() {
        switch (this.f46982a) {
            case 0:
                long j3 = this.f46984c;
                np npVar = this.f46983b;
                npVar.f50261n = j3;
                npVar.f50266r = true;
                npVar.s0();
                return;
            default:
                np.e0(this.f46983b, this.f46984c);
                return;
        }
    }
}
