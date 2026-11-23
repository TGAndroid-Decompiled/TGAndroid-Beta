package org.telegram.ui;
public final class dp implements Runnable {
    public final int f47206a;
    public final np f47207b;
    public final long f47208c;

    public dp(np npVar, long j3, int i7) {
        this.f47206a = i7;
        this.f47207b = npVar;
        this.f47208c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47206a) {
            case 0:
                long j3 = this.f47208c;
                np npVar = this.f47207b;
                npVar.f50370n = j3;
                npVar.f50375r = true;
                npVar.s0();
                return;
            default:
                np.e0(this.f47207b, this.f47208c);
                return;
        }
    }
}
