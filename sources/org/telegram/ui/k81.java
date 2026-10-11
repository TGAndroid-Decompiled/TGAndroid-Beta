package org.telegram.ui;
public final class k81 implements Runnable {
    public final int f39233a;
    public final SessionsActivity f39234b;
    public final boolean f39235c;

    public k81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39233a = i10;
        this.f39234b = sessionsActivity;
        this.f39235c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39233a) {
            case 0:
                this.f39234b.k0(this.f39235c);
                return;
            default:
                this.f39234b.k0(this.f39235c);
                return;
        }
    }
}
