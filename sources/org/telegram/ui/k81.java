package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f37985a;
    public final SessionsActivity f37986b;
    public final boolean f37987c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f37985a = i10;
        this.f37986b = sessionsActivity;
        this.f37987c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37985a) {
            case 0:
                this.f37986b.k0(this.f37987c);
                return;
            default:
                this.f37986b.k0(this.f37987c);
                return;
        }
    }
}
