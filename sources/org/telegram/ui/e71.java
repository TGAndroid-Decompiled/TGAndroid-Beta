package org.telegram.ui;
public final class e71 implements Runnable {
    public final int f37716a;
    public final SessionsActivity f37717b;
    public final boolean f37718c;

    public e71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f37716a = i10;
        this.f37717b = sessionsActivity;
        this.f37718c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37716a) {
            case 0:
                this.f37717b.k0(this.f37718c);
                return;
            default:
                this.f37717b.k0(this.f37718c);
                return;
        }
    }
}
