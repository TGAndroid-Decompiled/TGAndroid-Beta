package org.telegram.ui;
public final class j81 implements Runnable {
    public final int f34816a;
    public final SessionsActivity f34817b;
    public final boolean f34818c;

    public j81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f34816a = i10;
        this.f34817b = sessionsActivity;
        this.f34818c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34816a) {
            case 0:
                this.f34817b.k0(this.f34818c);
                return;
            default:
                this.f34817b.k0(this.f34818c);
                return;
        }
    }
}
