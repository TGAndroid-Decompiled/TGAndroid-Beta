package org.telegram.ui;
public final class l81 implements Runnable {
    public final int f39473a;
    public final SessionsActivity f39474b;
    public final boolean f39475c;

    public l81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39473a = i10;
        this.f39474b = sessionsActivity;
        this.f39475c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39473a) {
            case 0:
                this.f39474b.k0(this.f39475c);
                return;
            default:
                this.f39474b.k0(this.f39475c);
                return;
        }
    }
}
