package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f51069a;
    public final SessionsActivity f51070b;
    public final boolean f51071c;

    public q21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f51069a = i7;
        this.f51070b = sessionsActivity;
        this.f51071c = z10;
    }

    @Override
    public final void run() {
        switch (this.f51069a) {
            case 0:
                this.f51070b.p0(this.f51071c);
                return;
            default:
                this.f51070b.p0(this.f51071c);
                return;
        }
    }
}
