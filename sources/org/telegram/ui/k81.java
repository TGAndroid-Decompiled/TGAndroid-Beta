package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f35062a;
    public final SessionsActivity f35063b;
    public final boolean f35064c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35062a = i10;
        this.f35063b = sessionsActivity;
        this.f35064c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35062a) {
            case 0:
                this.f35063b.k0(this.f35064c);
                return;
            default:
                this.f35063b.k0(this.f35064c);
                return;
        }
    }
}
