package org.telegram.ui;

public final class b71 implements Runnable {

    public final int f36717a;

    public final SessionsActivity f36718b;

    public final boolean f36719c;

    public b71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f36717a = i10;
        this.f36718b = sessionsActivity;
        this.f36719c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36717a) {
            case 0:
                this.f36718b.k0(this.f36719c);
                break;
            default:
                this.f36718b.k0(this.f36719c);
                break;
        }
    }
}
