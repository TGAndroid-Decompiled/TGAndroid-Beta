package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f37986a;
    public final SessionsActivity f37987b;
    public final boolean f37988c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f37986a = i10;
        this.f37987b = sessionsActivity;
        this.f37988c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37986a) {
            case 0:
                this.f37987b.k0(this.f37988c);
                return;
            default:
                this.f37987b.k0(this.f37988c);
                return;
        }
    }
}
