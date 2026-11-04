package org.telegram.ui;
public final class pe implements Runnable {
    public final int f48555a;
    public final wm f48556b;
    public final long f48557c;
    public final long d;

    public pe(wm wmVar, long j10, long j11, int i3) {
        this.f48555a = i3;
        this.f48556b = wmVar;
        this.f48557c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f48555a) {
            case 0:
                wm.o0(this.f48556b, this.f48557c, this.d);
                return;
            default:
                wm.F1(this.f48556b, this.f48557c, this.d);
                return;
        }
    }
}
