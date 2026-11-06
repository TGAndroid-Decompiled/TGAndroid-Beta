package org.telegram.ui;
public final class p21 implements Runnable {
    public final int f48598a;
    public final SessionsActivity f48599b;
    public final boolean f48600c;

    public p21(SessionsActivity sessionsActivity, boolean z9, int i7) {
        this.f48598a = i7;
        this.f48599b = sessionsActivity;
        this.f48600c = z9;
    }

    @Override
    public final void run() {
        switch (this.f48598a) {
            case 0:
                this.f48599b.p0(this.f48600c);
                return;
            default:
                this.f48599b.p0(this.f48600c);
                return;
        }
    }
}
