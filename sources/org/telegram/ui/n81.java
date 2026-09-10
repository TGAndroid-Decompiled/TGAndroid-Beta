package org.telegram.ui;
public final class n81 implements Runnable {
    public final int f35151a;
    public final SessionsActivity f35152b;
    public final boolean f35153c;

    public n81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35151a = i10;
        this.f35152b = sessionsActivity;
        this.f35153c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35151a) {
            case 0:
                this.f35152b.k0(this.f35153c);
                return;
            default:
                this.f35152b.k0(this.f35153c);
                return;
        }
    }
}
