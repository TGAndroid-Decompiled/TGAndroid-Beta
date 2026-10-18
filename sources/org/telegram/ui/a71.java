package org.telegram.ui;
public final class a71 implements Runnable {
    public final int f35325a;
    public final SessionsActivity f35326b;
    public final boolean f35327c;

    public a71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35325a = i10;
        this.f35326b = sessionsActivity;
        this.f35327c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35325a) {
            case 0:
                this.f35326b.k0(this.f35327c);
                return;
            default:
                this.f35326b.k0(this.f35327c);
                return;
        }
    }
}
