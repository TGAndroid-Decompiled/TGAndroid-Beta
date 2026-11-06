package org.telegram.ui;
public final class p21 implements Runnable {
    public final int f48592a;
    public final SessionsActivity f48593b;
    public final boolean f48594c;

    public p21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.f48592a = i7;
        this.f48593b = sessionsActivity;
        this.f48594c = z9;
    }

    @Override
    public final void run() {
        switch (this.f48592a) {
            case 0:
                this.f48593b.p0(this.f48594c);
                return;
            default:
                this.f48593b.p0(this.f48594c);
                return;
        }
    }
}
