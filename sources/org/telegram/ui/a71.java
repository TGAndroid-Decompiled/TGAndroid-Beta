package org.telegram.ui;
public final class a71 implements Runnable {
    public final int f35277a;
    public final SessionsActivity f35278b;
    public final boolean f35279c;

    public a71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35277a = i10;
        this.f35278b = sessionsActivity;
        this.f35279c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35277a) {
            case 0:
                this.f35278b.k0(this.f35279c);
                return;
            default:
                this.f35278b.k0(this.f35279c);
                return;
        }
    }
}
