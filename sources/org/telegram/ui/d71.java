package org.telegram.ui;
public final class d71 implements Runnable {
    public final int f38747a;
    public final SessionsActivity f38748b;
    public final boolean f38749c;

    public d71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f38747a = i10;
        this.f38748b = sessionsActivity;
        this.f38749c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38747a) {
            case 0:
                this.f38748b.l0(this.f38749c);
                return;
            default:
                this.f38748b.l0(this.f38749c);
                return;
        }
    }
}
