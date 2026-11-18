package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f50990a;
    public final SessionsActivity f50991b;
    public final boolean f50992c;

    public q21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f50990a = i7;
        this.f50991b = sessionsActivity;
        this.f50992c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50990a) {
            case 0:
                this.f50991b.p0(this.f50992c);
                return;
            default:
                this.f50991b.p0(this.f50992c);
                return;
        }
    }
}
