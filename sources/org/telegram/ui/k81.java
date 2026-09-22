package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f35084a;
    public final SessionsActivity f35085b;
    public final boolean f35086c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35084a = i10;
        this.f35085b = sessionsActivity;
        this.f35086c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35084a) {
            case 0:
                this.f35085b.k0(this.f35086c);
                return;
            default:
                this.f35085b.k0(this.f35086c);
                return;
        }
    }
}
