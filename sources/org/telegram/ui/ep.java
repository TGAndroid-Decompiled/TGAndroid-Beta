package org.telegram.ui;
public final class ep implements Runnable {
    public final int f47285a;
    public final np f47286b;
    public final long f47287c;

    public ep(np npVar, long j3, int i7) {
        this.f47285a = i7;
        this.f47286b = npVar;
        this.f47287c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47285a) {
            case 0:
                long j3 = this.f47287c;
                np npVar = this.f47286b;
                npVar.f50243n = j3;
                npVar.f50248r = true;
                npVar.s0();
                return;
            default:
                np.e0(this.f47286b, this.f47287c);
                return;
        }
    }
}
