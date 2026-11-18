package org.telegram.ui;
public final class ep implements Runnable {
    public final int f47329a;
    public final np f47330b;
    public final long f47331c;

    public ep(np npVar, long j3, int i7) {
        this.f47329a = i7;
        this.f47330b = npVar;
        this.f47331c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47329a) {
            case 0:
                long j3 = this.f47331c;
                np npVar = this.f47330b;
                npVar.f50259n = j3;
                npVar.f50264r = true;
                npVar.s0();
                return;
            default:
                np.e0(this.f47330b, this.f47331c);
                return;
        }
    }
}
