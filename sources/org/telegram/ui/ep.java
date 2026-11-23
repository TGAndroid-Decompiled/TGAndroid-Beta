package org.telegram.ui;
public final class ep implements Runnable {
    public final int f47358a;
    public final np f47359b;
    public final long f47360c;

    public ep(np npVar, long j3, int i7) {
        this.f47358a = i7;
        this.f47359b = npVar;
        this.f47360c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47358a) {
            case 0:
                long j3 = this.f47360c;
                np npVar = this.f47359b;
                npVar.f50254n = j3;
                npVar.f50259r = true;
                npVar.s0();
                return;
            default:
                np.e0(this.f47359b, this.f47360c);
                return;
        }
    }
}
