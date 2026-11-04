package org.telegram.ui;
public final class f21 implements Runnable {
    public final int f45127a;
    public final SessionsActivity f45128b;
    public final boolean f45129c;

    public f21(SessionsActivity sessionsActivity, boolean z10, int i3) {
        this.f45127a = i3;
        this.f45128b = sessionsActivity;
        this.f45129c = z10;
    }

    @Override
    public final void run() {
        switch (this.f45127a) {
            case 0:
                this.f45128b.p0(this.f45129c);
                return;
            default:
                this.f45128b.p0(this.f45129c);
                return;
        }
    }
}
