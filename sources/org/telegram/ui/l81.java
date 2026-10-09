package org.telegram.ui;
public final class l81 implements Runnable {
    public final int f39471a;
    public final SessionsActivity f39472b;
    public final boolean f39473c;

    public l81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39471a = i10;
        this.f39472b = sessionsActivity;
        this.f39473c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39471a) {
            case 0:
                this.f39472b.k0(this.f39473c);
                return;
            default:
                this.f39472b.k0(this.f39473c);
                return;
        }
    }
}
