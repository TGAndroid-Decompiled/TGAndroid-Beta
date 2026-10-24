package org.telegram.ui;
public final class b71 implements Runnable {
    public final int f35944a;
    public final SessionsActivity f35945b;
    public final boolean f35946c;

    public b71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35944a = i10;
        this.f35945b = sessionsActivity;
        this.f35946c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35944a) {
            case 0:
                this.f35945b.k0(this.f35946c);
                return;
            default:
                this.f35945b.k0(this.f35946c);
                return;
        }
    }
}
