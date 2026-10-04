package org.telegram.ui;
public final class d81 implements Runnable {
    public final int f35697a;
    public final SessionsActivity f35698b;
    public final boolean f35699c;

    public d81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35697a = i10;
        this.f35698b = sessionsActivity;
        this.f35699c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35697a) {
            case 0:
                this.f35698b.k0(this.f35699c);
                return;
            default:
                this.f35698b.k0(this.f35699c);
                return;
        }
    }
}
