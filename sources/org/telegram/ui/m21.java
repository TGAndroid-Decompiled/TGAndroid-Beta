package org.telegram.ui;
public final class m21 implements Runnable {
    public final int f49089a;
    public final SessionsActivity f49090b;
    public final boolean f49091c;

    public m21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f49089a = i7;
        this.f49090b = sessionsActivity;
        this.f49091c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49089a) {
            case 0:
                this.f49090b.p0(this.f49091c);
                return;
            default:
                this.f49090b.p0(this.f49091c);
                return;
        }
    }
}
