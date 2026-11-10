package org.telegram.ui;
public final class dp implements Runnable {
    public final int f45030a;
    public final mp f45031b;
    public final long f45032c;

    public dp(mp mpVar, long j3, int i7) {
        this.f45030a = i7;
        this.f45031b = mpVar;
        this.f45032c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45030a) {
            case 0:
                long j3 = this.f45032c;
                mp mpVar = this.f45031b;
                mpVar.f48019n = j3;
                mpVar.f48024r = true;
                mpVar.s0();
                return;
            default:
                mp.e0(this.f45031b, this.f45032c);
                return;
        }
    }
}
