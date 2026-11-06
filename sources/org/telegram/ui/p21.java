package org.telegram.ui;
public final class p21 implements Runnable {
    public final int f48593a;
    public final SessionsActivity f48594b;
    public final boolean f48595c;

    public p21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.f48593a = i7;
        this.f48594b = sessionsActivity;
        this.f48595c = z9;
    }

    @Override
    public final void run() {
        switch (this.f48593a) {
            case 0:
                this.f48594b.p0(this.f48595c);
                return;
            default:
                this.f48594b.p0(this.f48595c);
                return;
        }
    }
}
