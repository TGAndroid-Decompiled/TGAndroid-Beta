package org.telegram.ui;
public final class a71 implements Runnable {
    public final int f35305a;
    public final SessionsActivity f35306b;
    public final boolean f35307c;

    public a71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35305a = i10;
        this.f35306b = sessionsActivity;
        this.f35307c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35305a) {
            case 0:
                this.f35306b.k0(this.f35307c);
                return;
            default:
                this.f35306b.k0(this.f35307c);
                return;
        }
    }
}
