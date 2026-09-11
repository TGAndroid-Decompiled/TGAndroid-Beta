package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f37958a;
    public final SessionsActivity f37959b;
    public final boolean f37960c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f37958a = i10;
        this.f37959b = sessionsActivity;
        this.f37960c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37958a) {
            case 0:
                this.f37959b.k0(this.f37960c);
                return;
            default:
                this.f37959b.k0(this.f37960c);
                return;
        }
    }
}
