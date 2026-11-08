package org.telegram.ui;
public final class p21 implements Runnable {
    public final int f48586a;
    public final SessionsActivity f48587b;
    public final boolean f48588c;

    public p21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.f48586a = i7;
        this.f48587b = sessionsActivity;
        this.f48588c = z9;
    }

    @Override
    public final void run() {
        switch (this.f48586a) {
            case 0:
                this.f48587b.p0(this.f48588c);
                return;
            default:
                this.f48587b.p0(this.f48588c);
                return;
        }
    }
}
