package org.telegram.ui;
public final class d81 implements Runnable {
    public final int f35696a;
    public final SessionsActivity f35697b;
    public final boolean f35698c;

    public d81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35696a = i10;
        this.f35697b = sessionsActivity;
        this.f35698c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35696a) {
            case 0:
                this.f35697b.k0(this.f35698c);
                return;
            default:
                this.f35697b.k0(this.f35698c);
                return;
        }
    }
}
