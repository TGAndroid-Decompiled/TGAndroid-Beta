package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f37959a;
    public final SessionsActivity f37960b;
    public final boolean f37961c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f37959a = i10;
        this.f37960b = sessionsActivity;
        this.f37961c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37959a) {
            case 0:
                this.f37960b.k0(this.f37961c);
                return;
            default:
                this.f37960b.k0(this.f37961c);
                return;
        }
    }
}
