package org.telegram.ui;
public final class ep implements Runnable {
    public final int f47354a;
    public final np f47355b;
    public final long f47356c;

    public ep(np npVar, long j3, int i7) {
        this.f47354a = i7;
        this.f47355b = npVar;
        this.f47356c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47354a) {
            case 0:
                long j3 = this.f47356c;
                np npVar = this.f47355b;
                npVar.f50250n = j3;
                npVar.f50255r = true;
                npVar.s0();
                return;
            default:
                np.e0(this.f47355b, this.f47356c);
                return;
        }
    }
}
