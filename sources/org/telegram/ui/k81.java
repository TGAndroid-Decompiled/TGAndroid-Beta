package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f39267a;
    public final SessionsActivity f39268b;
    public final boolean f39269c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39267a = i10;
        this.f39268b = sessionsActivity;
        this.f39269c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39267a) {
            case 0:
                this.f39268b.k0(this.f39269c);
                return;
            default:
                this.f39268b.k0(this.f39269c);
                return;
        }
    }
}
